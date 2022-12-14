package com.takeiteasy.DAO;
import org.junit.Test;

import com.takeiteasy.entities.Pomodoro;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;    


public class PomodoroDAOTest {
    private PomodoroDAO pDao = new PomodoroDAO();
    @Test    
    public void ItShouldBeInserted(){
        Pomodoro pomodoroObj = new Pomodoro();
        pomodoroObj.setId(0);
        pomodoroObj.setPomodoro(30);
        pomodoroObj.setShortBreak(5);
        pomodoroObj.setCycle(1);
        pomodoroObj.setLongBreak(15);
        pomodoroObj.setStatus("ok");
        pDao.insert(pomodoroObj.getShortBreak(), pomodoroObj.getLongBreak(), 
        pomodoroObj.getPomodoro(), pomodoroObj.getCycle(), pomodoroObj.getStatus());
        Pomodoro pomodoro2 = pDao.get(0);
        assertNotNull(null, pomodoro2);
    }
    @Test
    public void ItShouldBelisted() {
    }
    @Test
    public void get(int id) {
        Pomodoro pomodoroObj = new Pomodoro();
        pomodoroObj.setId(0);
        pomodoroObj.setPomodoro(30);
        pomodoroObj.setShortBreak(5);
        pomodoroObj.setCycle(1);
        pomodoroObj.setLongBreak(15);
        pomodoroObj.setStatus("ok");
        pDao.insert(pomodoroObj.getShortBreak(), pomodoroObj.getLongBreak(),
                pomodoroObj.getPomodoro(), pomodoroObj.getCycle(), pomodoroObj.getStatus());
        assertNotNull(pDao.get(0));
    }
    @Test
    public void update() {
        Pomodoro pomodoroObj = new Pomodoro();
        pomodoroObj.setId(0);
        pomodoroObj.setPomodoro(30);
        pomodoroObj.setShortBreak(5);
        pomodoroObj.setCycle(1);
        pomodoroObj.setLongBreak(15);
        pomodoroObj.setStatus("ok");
        pDao.insert(pomodoroObj.getShortBreak(), pomodoroObj.getLongBreak(),
                pomodoroObj.getPomodoro(), pomodoroObj.getCycle(), pomodoroObj.getStatus());
        Pomodoro pomodoro2 = pDao.get(0);
        pomodoro2.setStatus("not ok");
        assertNotEquals(pomodoroObj.getStatus(), pomodoro2.getStatus());
    }
    @Test
    public void delete(int id) {
        Pomodoro pomodoroObj = new Pomodoro();
        pomodoroObj.setId(2);
        pomodoroObj.setPomodoro(30);
        pomodoroObj.setShortBreak(5);
        pomodoroObj.setCycle(1);
        pomodoroObj.setLongBreak(15);
        pomodoroObj.setStatus("ok");
        pDao.insert(pomodoroObj.getShortBreak(), pomodoroObj.getLongBreak(),
                pomodoroObj.getPomodoro(), pomodoroObj.getCycle(), pomodoroObj.getStatus());
        Pomodoro pomodoro2 = pDao.get(2);
        assertNull(null, pomodoro2);
    }

}
    