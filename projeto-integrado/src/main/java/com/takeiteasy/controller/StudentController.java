package com.takeiteasy.controller;

import java.util.List;

import com.takeiteasy.DAO.StudentDAO;
import com.takeiteasy.entities.Student;

public class StudentController {
    StudentDAO studentDAO = new StudentDAO();
    
    public void insert(String name) {
        studentDAO.insert(name);
    }
    
    public List<Student> list() {
        return studentDAO.list();
    }

    public Student get(int id) {
        return studentDAO.get(id);
    }

    public void update(Student student) {
        studentDAO.update(student);
    }

    public void delete(int id) {
        studentDAO.delete(id);
    }
}
