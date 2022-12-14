package com.takeiteasy.DAO;
import org.junit.Test;

import com.takeiteasy.entities.Activity;
import com.takeiteasy.entities.Dashboard;
import com.takeiteasy.entities.Pomodoro;
import com.takeiteasy.entities.Student;
import com.takeiteasy.entities.Tag;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Before;    
    
public class DashboardDAOTest {

    private DashboardDAO dashDao = new DashboardDAO();

    @Test
    public void ItShouldBeInserted() {
        Tag tag = new Tag();
        Pomodoro pomodoro = new Pomodoro();
        Student student = new Student();
        Activity activity = new Activity();
        activity.setName("Programação");
        activity.setPomodoro(pomodoro);
        activity.setStudent(student);
        activity.setTag(tag);
        ArrayList<Activity> activities = new ArrayList<Activity>();
        activities.add(activity);
        Dashboard dashboard = new Dashboard();
        dashboard.setId(0);
        dashboard.setActivities(activities);
        dashDao.insert(
            dashboard.getId(),
            activity
            );
        Dashboard dashboard2 = dashDao.get(0);
        assertNotNull(null, dashboard2);
    }

    @Test
    public void ItShouldBelisted() {
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
        dashDao.insert(pomodoroObj.getShortBreak(), pomodoroObj.getLongBreak(),
                pomodoroObj.getPomodoro(), pomodoroObj.getCycle(), pomodoroObj.getStatus());
        Pomodoro pomodoro2 = dashDao.get(0);
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
        dashDao.insert(pomodoroObj.getShortBreak(), pomodoroObj.getLongBreak(),
                pomodoroObj.getPomodoro(), pomodoroObj.getCycle(), pomodoroObj.getStatus());
        Pomodoro pomodoro2 = dashDao.get(2);
        assertNull(null, pomodoro2);
    }
}
    