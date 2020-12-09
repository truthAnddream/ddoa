package com.qf.service.Impl;

import Allpojo.Student;
import com.qf.dao.IStudentdao;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentdao studentdao ;
    @Override
    public List<Student> getAllStudent() {
        return studentdao.getAllStudent();
    }

    @Override
    public boolean saveStudent(Student s) {
        return studentdao.saveStudent(s)>0;
    }
    @Override
    public Student selectStudentByUid(int uid) {
        return studentdao.selectStudentByUid(uid);
    }

    @Override
    public boolean deleteStudent(int uid) {
        return studentdao.deleteStudent(uid)>0;
    }

    @Override
    public boolean updateStudent(Student s) {
        return studentdao.updateStudent(s)>0;
    }


}
