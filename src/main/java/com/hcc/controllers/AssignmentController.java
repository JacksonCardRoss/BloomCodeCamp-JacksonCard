package com.hcc.controllers;


import com.hcc.entities.Assignment;
import com.hcc.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/*
@RestController
@RequestMapping("/assignments")
public class AssignmentController {

    @Autowired
    AssignmentRepository assignmentRepository;

    @GetMapping("/{assignmentId}")
    public ResponseEntity<?> getAssignmentById(@PathVariable Long assignmentId) {
        Optional<Assignment> assignmentOpt = assignmentRepository.findById(assignmentId);
        return ResponseEntity.ok(assignmentOpt.orElse(new Assignment()));
    }

    @GetMapping("/{user}")

    @PostMapping
    public ResponseEntity<?> saveAssignment(@RequestBody Assignment assignment) {
        return ResponseEntity.ok(assignmentRepository.save(assignment));
    }

    @PutMapping
    public ResponseEntity<?> editAssignment(@RequestBody Assignment assignment) {
        // TODO - implement
        return null;
    }

}

 */
