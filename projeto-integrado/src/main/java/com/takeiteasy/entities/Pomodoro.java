package com.takeiteasy.entities;

public class Pomodoro {
    private int id;
    private int shortBreak = 5, longBreak = 30, pomodoro = 25, cycle = 0;
    private String status = "reset";
    
    public Pomodoro(int shortBreak, int longBreak, int pomodoro, int cycle, String status) {
        this.shortBreak = shortBreak;
        this.longBreak = longBreak;
        this.pomodoro = pomodoro;
        this.cycle = cycle;
        this.status = status;
    }

    public Pomodoro() {}

    public int getShortBreak() {
        return shortBreak;
    }
    public void setShortBreak(int shortBreak) {
        this.shortBreak = shortBreak;
    }
    public int getLongBreak() {
        return longBreak;
    }
    public void setLongBreak(int longBreak) {
        this.longBreak = longBreak;
    }
    public int getPomodoro() {
        return pomodoro;
    }
    public void setPomodoro(int pomodoro) {
        this.pomodoro = pomodoro;
    }
    public int getCycle() {
        return cycle;
    }
    public void setCycle(int cycle) {
        this.cycle = cycle;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
