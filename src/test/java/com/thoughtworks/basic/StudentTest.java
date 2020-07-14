package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void introduceTest() {
        Student student = new Student("Tom","21","2");
        Assert.assertEquals("My name is Tom. I am 21 years old. I am a Student of Class 2.",student.introduce());
    }
}