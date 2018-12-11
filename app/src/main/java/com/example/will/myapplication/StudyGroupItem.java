package com.example.will.myapplication;

public class StudyGroupItem {
    private String name;
    private String time;
    private String subject;
    private int numberOfPeople;

    public StudyGroupItem() {
        this.name = "";
        this.time = "";
        this.subject = "";
        this.numberOfPeople = 0;
    }

    public StudyGroupItem(String name, String time, String subject, int numberOfPeople) {
        this.name = name;
        this.time = time;
        this.subject = subject;
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
