package com.takeiteasy.entities;
import org.junit.*;    
    
public class ActivityTest {

    public void createActivity(){
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
    }
}
    