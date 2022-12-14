package com.takeiteasy.entities;
import org.junit.Test;
import org.junit.Before;    
    
public class DashboardTest {
    @Test
    public void test() {
        Tag tag = new Tag();
        Pomodoro pomodoro = new Pomodoro();
        Student student = new Student();
        Activity activity = new Activity();
        activity.setName("Programação");
        activity.setPomodoro(pomodoro);
        activity.setStudent(student);
        activity.setTag(tag);
        Dashboard dashboard = new Dashboard();
    }
}
    