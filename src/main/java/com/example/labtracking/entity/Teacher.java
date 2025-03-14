package com.example.labtracking.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Teachers")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", unique = true, nullable = false)
    private User user;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    public Teacher(User user, String fullName) {
        this.user = user;
        this.fullName = fullName;
    }
}
