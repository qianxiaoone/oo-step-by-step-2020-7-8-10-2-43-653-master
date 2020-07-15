package com.thoughtworks.basic;

public class Teacher extends Person {
    private String job;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a %s.", super.introduce(), this.job);
    }
}
