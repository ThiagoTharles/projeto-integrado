package com.takeiteasy.DAO;

import org.junit.Test;

import com.takeiteasy.entities.Activity;
import com.takeiteasy.entities.Pomodoro;
import com.takeiteasy.entities.Student;
import com.takeiteasy.entities.Tag;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
  
    
public class ActivityDAOTest {
    private ActivityDAO actDao = new ActivityDAO();
    @Test
    public void ItShouldBeInserted() {
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
        actDao.insert(
            activity.getName(), " ",
            activity.getTag().getId(),
            activity.getPomodoro().getId(),
            activity.getStudent().getId()
        );
        Activity activity2 = actDao.get(0);
        assertNotNull("Activity inserted", activity2);
    }

    @Test
    public void ItShouldBelisted() {
    }

    @Test
    public void get(int id) {
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
        actDao.insert(
            activity.getName(), " ",
            activity.getTag().getId(),
            activity.getPomodoro().getId(),
            activity.getStudent().getId()
        );
        assertNotNull(actDao.get(0));
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
        actDao.insert(
            activity.getName(), " ",
            activity.getTag().getId(),
            activity.getPomodoro().getId(),
            activity.getStudent().getId()
        );
        Activity activity2 = actDao.get(0);
        activity2.setDescription("not ok");
        assertNotEquals(activity.getDescription(), activity2.getDescription());
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
        actDao.insert(
            activity.getName(), " ",
            activity.getTag().getId(),
            activity.getPomodoro().getId(),
            activity.getStudent().getId()
        );
        Activity activity2 = actDao.get(0);
        assertNull(null, activity2);
    }
}
    