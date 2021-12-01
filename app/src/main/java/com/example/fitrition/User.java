package com.example.fitrition;

import java.time.LocalDate;

public class User {
    private String email;
    private String password;
    private float height;
    private float weight;
    private LocalDate dateOfBirth;

    // 0 = Male
    // 1 = Female
    // 2 = Prefer not to say
    private int sex;

    public User() {
    }

    public User(String email, String password, float height, float weight, LocalDate dateOfBirth, int sex) {
        this.email = email;
        this.password = password;
        this.height = height;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
