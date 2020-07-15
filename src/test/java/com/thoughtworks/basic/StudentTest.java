package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.plaf.synth.SynthTableUI;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    @Test
    public void introduceTest() {
        Klass klass = new Klass();
        klass.setClassNumber("2");
        Student student = new Student();
        student.setName("Tom");
        student.setAge("21");
        student.setKlass(klass);
        Assert.assertEquals("My name is Tom. I am 21 years old. I am a Student of Class 2.", student.introduce());
    }

    @Test
    public void changeNameTest() {
        Klass klass = new Klass();
        klass.setClassNumber("2");
        Student student1 = new Student();
        student1.setName("Mark");
        student1.setAge("21");
        student1.setKlass(klass);
        Student student2 = new Student();
        student2.setName("Tony");
        student2.setAge("21");
        student2.setKlass(klass);
        Teacher teacher = new Teacher();
        teacher.setJob("Teacher");
        teacher.setAge("30");
        teacher.setName("Matt");
        List<Student> students = klass.getStudents();
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student1);
        students.add(student2);
        klass.setStudents(students);
        klass.setTeacher(teacher);
        student1.setName("Tom");
        Assert.assertEquals("My name is Tom. I am 21 years old. I am a student of Class 2 now.", student2.getMessage());
    }

    @Test
    public void changeKlassTest() {
        Klass klass = new Klass();
        klass.setClassNumber("1");
        Student student1 = new Student();
        student1.setName("Tom");
        student1.setAge("21");
        student1.setKlass(klass);
        Student student2 = new Student();
        student2.setName("Tony");
        student2.setAge("21");
        student2.setKlass(klass);
        Teacher teacher = new Teacher();
        teacher.setJob("Teacher");
        teacher.setAge("30");
        teacher.setName("Matt");
        List<Student> students = klass.getStudents();
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student1);
        students.add(student2);
        klass.setStudents(students);
        klass.setTeacher(teacher);
        Klass newKlass = new Klass();
        newKlass.setClassNumber("2");
        student1.setKlass(newKlass);
        Assert.assertEquals("My name is Tom. I am 21 years old. I am a student of Class 2 now.", student2.getMessage());
    }
}