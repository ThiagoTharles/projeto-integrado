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
import java.util.List;   
    
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
        List<Activity> dashboard2 = dashDao.list(0);
        assertNotNull(null, dashboard2);
    }

    @Test
    public void ItShouldBelisted() {
    }

    @Test
    public void update() {
        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("novo");
        Pomodoro pomodoro = new Pomodoro();
        pomodoro.setId(0);
        pomodoro.setPomodoro(30);
        pomodoro.setShortBreak(5);
        pomodoro.setCycle(1);
        pomodoro.setLongBreak(15);
        Student student = new Student();
        student.setId(0);
        student.setName("Colombo");
        Activity activity = new Activity();
        activity.setName("Programação");
        activity.setPomodoro(pomodoro);
        activity.setStudent(student);
        activity.setTag(tag);
        dashDao.insert(0, activity);
        Activity activity2 = dashDao.get(0, 0);
        activity2.getPomodoro().setStatus("not ok");
        assertNotEquals(activity.getPomodoro().getStatus(), activity2.getPomodoro().getStatus());
    }

    @Test
    public void delete(int id) {
        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("novo");
        Pomodoro pomodoro = new Pomodoro();
        pomodoro.setId(0);
        pomodoro.setPomodoro(30);
        pomodoro.setShortBreak(5);
        pomodoro.setCycle(1);
        pomodoro.setLongBreak(15);
        Student student = new Student();
        student.setId(0);
        student.setName("Colombo");
        Activity activity = new Activity();
        activity.setName("Programação");
        activity.setPomodoro(pomodoro);
        activity.setStudent(student);
        activity.setTag(tag);
        dashDao.insert(0, activity);
        Activity activity2 = dashDao.get(0,2);
        assertNull(null, activity2);
    }
}
    