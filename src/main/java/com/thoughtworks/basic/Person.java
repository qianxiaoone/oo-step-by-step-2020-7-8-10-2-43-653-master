package com.thoughtworks.basic;

public class Person {
    private String name;
    private String age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old.", this.name, this.age);
    }
}
