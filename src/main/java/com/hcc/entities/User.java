package com.hcc.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cohortStartDate")
    private Date cohortStartDate;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    //@ElementCollection(fetch = FetchType.EAGER)
    //private List<String> authorities;
}
