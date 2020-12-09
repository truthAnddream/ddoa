package com.qf.controller;


import Allpojo.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class StudentController extends SimpleDateFormat {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PostMapping("/saveStudent")
    public boolean saveStudent(@RequestBody Student s) {
      return studentService.saveStudent(s);
    }
    @GetMapping("/selectStudentByUid")
    public Student selectStudentByUid(int uid){
        return studentService.selectStudentByUid(uid);
    }

    @ResponseBody
    @GetMapping("/deleteStudent")
    public String deleteStudent(int uid){
        boolean b = studentService.deleteStudent(uid);
        if(b){
            System.out.println("successfully");
        }else {
            System.out.println("123");
        }
        return "";
    }
    @PostMapping("/updateStudent")
    public String updateStudent(@RequestBody Student s){
        boolean b = studentService.updateStudent(s);
        if(b){
            System.out.println("successful");
        }else {
            System.out.println("123");
        }
        return "";
    }
}
