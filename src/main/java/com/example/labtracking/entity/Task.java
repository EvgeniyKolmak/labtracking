package com.example.labtracking.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Tasks")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lab_id", nullable = false)
    private Lab lab;

    @Column(name = "task_description", columnDefinition = "TEXT", nullable = false)
    private String taskDescription;

    @Column(name = "max_score", nullable = false)
    private Integer maxScore;

    public Task(Lab lab, String taskDescription, Integer maxScore) {
        this.lab = lab;
        this.taskDescription = taskDescription;
        this.maxScore = maxScore;
    }

}
