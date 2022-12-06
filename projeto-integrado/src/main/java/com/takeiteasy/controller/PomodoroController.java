package com.takeiteasy.controller;

import java.util.List;

import com.takeiteasy.DAO.PomodoroDAO;
import com.takeiteasy.entities.Pomodoro;

public class PomodoroController {
    PomodoroDAO pomodoroDAO = new PomodoroDAO();
    
    public void insert(int shortBreak, int longBreak, int pomodoro, int cycle, String status) {
        pomodoroDAO.insert(shortBreak, longBreak, pomodoro, cycle, status);
    }
    
    public List<Pomodoro> list() {
        return pomodoroDAO.list();
    }

    public Pomodoro get(int id) {
        return pomodoroDAO.get(id);
    }

    public void update(Pomodoro pomodoro) {
        pomodoroDAO.update(pomodoro);
    }

    public void delete(int id) {
        pomodoroDAO.delete(id);
    }
}
