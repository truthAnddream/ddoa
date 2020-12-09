package com.qf.controller;


import Allpojo.Subject;
import com.qf.Service.ISubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("学科的控制器")
public class SubjectController {

    @Autowired
    private ISubjectService subjectServices;

    @GetMapping("/subject")
    @ApiOperation(value = "获取所有学科的信息列表")
    public List<Subject> getAllSubject(){
        return subjectServices.getAllSubject();
    }

    @GetMapping("/onesubject")
    @ApiOperation(value = "通过id获取指定学科的信息")
    public Subject getSubjectBySid(@ApiParam("sid") @Param("sid") int sid){
        return subjectServices.getSubjectBySid(sid);
    }

    @GetMapping("/deletesubject")
    @ApiOperation(value = "通过id删除指定的学科")
    public boolean deleteSubjectBySid(@Param("sid") int sid){
        return subjectServices.deleteSubjectBySid(sid);
    }
    @PostMapping("/updatesubject")
    @ApiOperation(value = "修改指定学科")
    public boolean updateSubject(@RequestBody Subject subject){
        return subjectServices.updateSubject(subject);
    }
    @PostMapping("/savesubject")
    @ApiOperation(value = "添加新学科")
    public boolean saveSubject(@RequestBody Subject subject){
        return subjectServices.saveSubject(subject);
    }
}
