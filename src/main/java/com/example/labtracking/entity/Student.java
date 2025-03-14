package com.example.labtracking.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Students")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", unique = true, nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private StudyGroup studyGroup;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    public Student(User user, StudyGroup studyGroup, String fullName) {
        this.user = user;
        this.studyGroup = studyGroup;
        this.fullName = fullName;
    }

    public Student(User user, String fullName) { // если без группы
        this.user = user;
        this.fullName = fullName;
    }
}
