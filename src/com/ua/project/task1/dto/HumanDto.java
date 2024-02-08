package com.ua.project.task1.dto;

import com.ua.project.task1.enums.Gender;

import java.util.Date;

public class HumanDto {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date birthDate;
    private Gender gender;

    public HumanDto(String firstName, String lastName, String patronymic, Date birthDate, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.gender = gender;
    }
    public HumanDto(String firstName, String lastName, Date birthDate, Gender gender) {
        this(firstName, lastName, "", birthDate, gender);
    }
    public HumanDto(String firstName, String lastName, Date birthDate) {
        this(firstName, lastName, birthDate, Gender.OTHER);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
