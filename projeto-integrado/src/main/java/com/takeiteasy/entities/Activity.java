package com.takeiteasy.entities;

public class Activity {
    private int id;
    private String name, description;
    private Tag tag;
    private Pomodoro pomodoro;
    private Student student;
    
    public Activity() {
    }
    public Activity(String name, String description, Tag tag, Pomodoro pomodoro, Student student) {
        this.name = name;
        this.description = description;
        this.tag = tag;
        this.pomodoro = pomodoro;
        this.student = student;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Tag getTag() {
        return tag;
    }
    public void setTag(Tag tag) {
        this.tag = tag;
    }
    public Pomodoro getPomodoro() {
        return pomodoro;
    }
    public void setPomodoro(Pomodoro pomodoro) {
        this.pomodoro = pomodoro;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
