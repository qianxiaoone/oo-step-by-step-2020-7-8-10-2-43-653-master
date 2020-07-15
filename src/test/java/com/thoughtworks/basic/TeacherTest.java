package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {

    @Test
    public void introduceTest() {
        Teacher teacher = new Teacher();
        teacher.setJob("Teacher");
        teacher.setAge("30");
        teacher.setName("Matt");
        Assert.assertEquals("My name is Matt. I am 30 years old. I am a Teacher.",teacher.introduce());
    }
}