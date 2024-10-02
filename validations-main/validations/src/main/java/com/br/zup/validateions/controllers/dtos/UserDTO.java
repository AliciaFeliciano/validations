package com.br.zup.validateions.controllers.dtos;

import java.util.UUID;

public class UserDTO {
    private UUID id;
    private String name;
    private int age;
    private int yearOfBirth;
    private String email;

    public UserDTO(String name, int age, int yearOfBirth, String email) {
        this.name = name;
        this.age = age;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public UserDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
