package com.thoughtworks.basic;

public class Student extends Person {
    private String classNumber;

    public Student(String classNumber) {
        this.classNumber = classNumber;
    }

    public Student(String name, String age, String classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a Student of Class %s.", super.introduce(), this.classNumber);
    }
}
