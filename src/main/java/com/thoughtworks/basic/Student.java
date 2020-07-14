package com.thoughtworks.basic;

public class Student extends Person {
    private Klass classNumber;

    public Student(Klass classNumber) {
        this.classNumber = classNumber;
    }

    public Student(String name, String age, Klass classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a Student of Class %s.", super.introduce(), this.classNumber.getClassNumber());
    }
}
