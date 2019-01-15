package com.example.classcourse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

    @Id @GeneratedValue
    Long id;

    String title;
    int minEnrollment;
    int maxEnrollment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinEnrollment() {
        return minEnrollment;
    }

    public void setMinEnrollment(int minEnrollment) {
        this.minEnrollment = minEnrollment;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }
}
