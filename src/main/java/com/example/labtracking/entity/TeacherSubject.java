package com.example.labtracking.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Teacher_Subjects")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
@Builder
public class TeacherSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    // Удобный конструктор
    public TeacherSubject(Teacher teacher, Subject subject) {
        this.teacher = teacher;
        this.subject = subject;
    }
}
