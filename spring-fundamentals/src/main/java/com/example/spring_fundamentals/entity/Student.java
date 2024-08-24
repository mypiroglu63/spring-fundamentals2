package com.example.spring_fundamentals.entity;

public class Student {
    private long id;
    private String firstName;
    private int grade;
    private boolean isSuccessfull;

    public Student() {
    }

    public Student(long id, String firstName, int grade, boolean isSuccessfull) {
        this.id = id;
        this.firstName = firstName;
        this.grade = grade;
        this.isSuccessfull = isSuccessfull;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isSuccessfull() {
        return isSuccessfull;
    }

    public void setSuccessfull(boolean successfull) {
        isSuccessfull = successfull;
    }
}
