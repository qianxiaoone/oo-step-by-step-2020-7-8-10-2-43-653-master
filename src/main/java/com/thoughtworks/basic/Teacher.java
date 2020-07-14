package com.thoughtworks.basic;

public class Teacher extends Person {
    private String job;

    public Teacher(String job) {
        this.job = job;
    }

    public Teacher(String name, String age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a %s.", super.introduce(), this.job);
    }
}
