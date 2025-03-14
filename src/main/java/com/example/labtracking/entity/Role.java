package com.example.labtracking.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public enum Role {

    ADMIN("ADMIN"),
    TEACHER("TEACHER"),
    STUDENT("STUDENT"),
    PARENT("PARENT");

    private final String role;
}
