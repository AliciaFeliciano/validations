package com.br.zup.validateions.controllers.dtos;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class UserRegisterDTO {

    @NotNull(message = "Nome obrigatorio")
    @Pattern(regexp = "^\\S+\\s+\\S+" , message = "Deve conter nome e sobrenome")
    private String name;

    @NotNull(message = "Idade obrigatoria")
    @Min(value = 18, message = "A idade minima é 18 anos")
    @Max(value = 110, message = "A idade maxima é 110 anos")
    private int age;

    @NotNull(message = "O ano não pode ser nulo")
    @Min(value = 1914, message = "O ano de nascimento não pode ser menor que 1914")
    @Max(value = 2024, message = "O ano não pode ser maior que o ano atual")
    private int yearOfBirth;

    @NotNull(message = "O email não pode ser nulo")
    @Email(message = "O emial esta despadronizado")
    private String email;

    public UserRegisterDTO() {
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

    public boolean YearBirthValidation() {
        int CorretoYear= LocalDate.now().getYear();
        return this.yearOfBirth == (CorretoYear - this.age);
    }
}
