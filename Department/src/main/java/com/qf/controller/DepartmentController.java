package com.qf.controller;


import Allpojo.Department;
import com.qf.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api( "部门控制层")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    //查询所有的部门
    @GetMapping("/getAll")
    @ApiOperation(value = "查询所有的部门信息")
    public List<Department> getAll(){
        return departmentService.getAll();
    }
    //添加部门
    @PostMapping("/saveDep")
    @ApiOperation(value = "添加部门")
    public boolean saveDep(@RequestBody Department department){
        return departmentService.saveDep(department);
    }
    //删除部门
    @GetMapping("/deleteDep")
    @ApiOperation(value = "删除部门")
    public boolean deleteDep(int did){
        return departmentService.deleteDep(did);
    }
    //修改部门
    @PostMapping("/updateDep")
    @ApiOperation(value ="修改部门" )
    public boolean updateDep(@RequestBody Department department){
        return departmentService.updateDep(department);
    }
    //根据id查询 部门
    @GetMapping("findOne")
    @ApiOperation(value = "根据id获取部门信息")
    public Department findOne(int did){
        return departmentService.findDep(did);
    }
}
