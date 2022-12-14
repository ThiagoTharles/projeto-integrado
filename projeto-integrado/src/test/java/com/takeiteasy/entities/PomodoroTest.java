package com.takeiteasy.entities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;    
    
public class PomodoroTest {
    @Test
    public void createTag() {
        Pomodoro pomodoro = new Pomodoro();
        pomodoro.setId(0);
        pomodoro.setPomodoro(30);
        pomodoro.setShortBreak(5);
        pomodoro.setCycle(1);
        pomodoro.setLongBreak(15);
        assertEquals(0,pomodoro.getId());
    }    
    
    @Test
    public void modifyTag() {
        Pomodoro pomodoro = new Pomodoro();
        pomodoro.setId(0);
        pomodoro.setPomodoro(30);
        pomodoro.setShortBreak(5);
        pomodoro.setCycle(1);
        pomodoro.setLongBreak(15);
        Pomodoro pomodoro1 = new Pomodoro();
        pomodoro1.setId(0);
        pomodoro1.setPomodoro(60);
        pomodoro1.setShortBreak(10);
        pomodoro1.setCycle(5);
        pomodoro1.setLongBreak(15);
        assertNotEquals(pomodoro1, pomodoro);
    }
}
    