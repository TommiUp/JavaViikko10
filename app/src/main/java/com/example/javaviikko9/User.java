package com.example.javaviikko9;

public class User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String degreeProgram;
    protected int image;

    public User(String firstName, String lastName, String email, String degreeProgram, int image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.image = image;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }
    public int getImage() {
        return image;
    }
}
