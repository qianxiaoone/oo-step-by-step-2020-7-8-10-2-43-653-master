package com.thoughtworks.basic;

import java.util.List;

public class Student extends Person {
    private Klass klass;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        updateKlass(this.klass, klass);
        this.klass = klass;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        updateName(this.klass);
    }

    @Override
    public String introduce() {
        return String.format("%s I am a Student of Class %s.", super.introduce(), this.klass.getClassNumber());
    }

    public void updateName(Klass klass) {
        if (klass != null) {
            List<Student> students = klass.getStudents();
            Teacher teacher = klass.getTeacher();
            for (Student student : students) {
                student.setMessage(String.format("My name is %s. I am %s years old. I am a student of Class %s now.", this.getName(), this.getAge(), klass.getClassNumber()));
            }
            teacher.setMessage(String.format("My name is %s. I am %s years old. I am a student of Class %s now.", this.getName(), this.getAge(), klass.getClassNumber()));
        }
    }

    public void updateKlass(Klass oldKlass, Klass newKlass) {
        if (oldKlass != null) {
            notify(oldKlass, newKlass);
        }

        if (newKlass != null) {
            notify(newKlass, newKlass);
        }
    }

    private void notify(Klass klass, Klass newKlass) {
        List<Student> klassStudents = klass.getStudents();
        Teacher klassTeacher = klass.getTeacher();
        String klassMessage = String.format("My name is %s. I am %s years old. I am a student of Class %s now.", this.getName(), this.getAge(), newKlass.getClassNumber());
        if (klassStudents != null) {
            for (Student student : klassStudents) {
                student.setMessage(klassMessage);
            }
        }
        if (klassTeacher != null) {
            klassTeacher.setMessage(klassMessage);
        }
    }

}
