package com.takeiteasy.DAO;
import org.junit.Test;

import com.takeiteasy.entities.Student;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

    
public class StudentDAOTest {
    private StudentDAO studentDao = new StudentDAO();

    @Test
    public void ItShouldBeInserted() {
        Student student = new Student();
        student.setId(0);
        student.setName("Colombo");
        studentDao.insert(
            student.getName()
        );
        Student student2 = studentDao.get(0);
        assertNotNull(null, student2);
    }

    @Test
    public void ItShouldBelisted() {
    }

    @Test
    public void get(int id) {
        Student student = new Student();
        student.setId(0);
        student.setName("Colombo");
        studentDao.insert(
                student.getName());
        assertNotNull(studentDao.get(0));
    }

    @Test
    public void update() {
        Student student = new Student();
        student.setId(0);
        student.setName("Colombo");
        studentDao.insert(
                student.getName());
        Student student2 = studentDao.get(0);
        student2.setName("Pedro");
        assertNotEquals(student.getName(), student2.getName());
    }

    @Test
    public void delete(int id) {
        Student student = new Student();
        student.setId(0);
        student.setName("Colombo");
        studentDao.insert(
                student.getName());
        Student student2 = studentDao.get(0);
        assertNull(null, student2);
    }
}
    