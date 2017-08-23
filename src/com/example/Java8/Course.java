package com.example.Java8;

/**
 * Created by svishnu on 7/26/17.
 */
public class Course {
    String title;
    long fee;

    public Course(String title, long fee){ this.title = title; this.fee = fee; }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }
}
