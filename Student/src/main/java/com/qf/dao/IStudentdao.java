package com.qf.dao;
import Allpojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentdao {

    List<Student> getAllStudent();

    int saveStudent(Student s);

    Student selectStudentByUid(int uid);

    int deleteStudent(int uid);

    int updateStudent(Student s);



}
