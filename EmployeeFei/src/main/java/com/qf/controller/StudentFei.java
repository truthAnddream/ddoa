package com.qf.controller;

import Allpojo.Student;
import com.qf.Feiclient.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentFei {
    @Autowired
    StudentClient studentClient;
    @RequestMapping(value = "getAllStudent",method = RequestMethod.GET)
    public List<Student> getAllStudent(){
        return studentClient.getAllStudent();
    }
    @RequestMapping(value = "saveStudent",method = RequestMethod.POST)
    public boolean saveStudent(Student s){
        System.out.println(s);
        return studentClient.saveStudent(s);
    }
    @RequestMapping(value = "selectStudentByUid",method = RequestMethod.GET)
    public Student selectStudentByUid(@RequestParam("uid") int uid){
        return studentClient.selectStudentByUid(uid);
    }
    @RequestMapping(value = "deleteStudent",method = RequestMethod.GET)
    public String deleteStudent(@RequestParam("uid")int uid){
        return studentClient.deleteStudent(uid);
    }
    @RequestMapping(value = "updateStudent",method = RequestMethod.POST)
    public String updateStudent(Student s){
        return studentClient.updateStudent(s);
    }
}
