package com.qf.service;

import Allpojo.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudent();

    boolean saveStudent(Student s);

    Student selectStudentByUid(int uid);

    boolean deleteStudent(int uid);

    boolean updateStudent(Student s);

}
