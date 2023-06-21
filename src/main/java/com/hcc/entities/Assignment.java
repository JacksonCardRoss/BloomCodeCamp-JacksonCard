package com.hcc.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="assignments")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status")
    private String status;

    @Column(name = "number")
    private int number;

    @Column(name = "githubUrl")
    private String githubUrl;

    @Column(name = "branch")
    private String branch;

    @Column(name = "reviewVideoUrl")
    private String reviewVideoUrl;

    @ManyToOne
    private User user;
}
