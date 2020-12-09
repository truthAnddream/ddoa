package com.qf.controller;

import Allpojo.Subject;
import com.qf.Feiclient.subjectFei;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class SubjectFei {
    @Autowired
    subjectFei sjf;
    @GetMapping("/subject")
    public List<Subject> getAllSubject(){
        return sjf.getAllSubject();
    }
    @GetMapping("/onesubject")
    public Subject getSubjectBySid( @RequestParam("sid") int sid){
        return sjf.getSubjectBySid(sid);
    }
    @GetMapping("/deletesubject")
    public boolean deleteSubjectBySid(@RequestParam("sid") int sid){
        return sjf.deleteSubjectBySid(sid);
    }
    @PostMapping("/updatesubject")
    public boolean updateSubject(Subject subject){
        return sjf.updateSubject(subject);
    }
    @PostMapping("/savesubject")
    public boolean saveSubject(Subject subject){
        System.out.println(subject);
        return sjf.saveSubject(subject);
    }


}
