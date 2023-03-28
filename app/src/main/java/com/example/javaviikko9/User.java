package com.example.javaviikko9;

import java.io.Serializable;

public class User implements Serializable {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String degreeProgram;
    protected int image;
    protected String kandi;
    protected String dippa;
    protected String tohtori;
    protected String maisteri;

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

    public String getKandi() {
        return kandi;
    }

    public void setKandi(String kandi) {
        this.kandi = kandi;
    }

    public String getDippa() {
        return dippa;
    }

    public void setDippa(String dippa) {
        this.dippa = dippa;
    }

    public String getTohtori() {
        return tohtori;
    }

    public void setTohtori(String tohtori) {
        this.tohtori = tohtori;
    }

    public String getMaisteri() {
        return maisteri;
    }

    public void setMaisteri(String maisteri) {
        this.maisteri = maisteri;
    }
}
