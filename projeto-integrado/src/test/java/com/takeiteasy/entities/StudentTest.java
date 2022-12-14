package com.takeiteasy.entities;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
  
    
public class StudentTest {
    @Test
    public void createStudent() {
        Student student = new Student();
        student.setId(0);
        student.setName("Colombo");
        assertEquals(0,student.getId());
    }    
    @Test
    public void modifyStudent() {
        Student student = new Student();
        student.setId(0);
        student.setName("Colombo");
        Student student1 = new Student();
        student1.setId(5);       
        student1.setName("Pedro");
        assertNotEquals(student, student);
    }
}
    