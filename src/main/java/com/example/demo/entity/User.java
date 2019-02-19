package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Long id;

    private Long version;

    private String username;

    private String password;

    private Integer age;

}