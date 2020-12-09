package com.qf.Feiclient;

import Allpojo.Department;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("department")
public interface DEpartment {
@RequestMapping(value = "getAll",method = RequestMethod.GET)
public List<Department> getAll();
    @RequestMapping(value = "saveDep",method = RequestMethod.POST)
    public boolean saveDep(@RequestBody Department department);
    @RequestMapping(value = "deleteDep",method = RequestMethod.GET)
    public boolean deleteDep(@RequestParam("did") int did);
    @RequestMapping(value = "updateDep",method = RequestMethod.POST)
    public boolean updateDep(@RequestBody  Department department);
    @RequestMapping(value = "findOne",method = RequestMethod.GET)
    public Department findOne(@RequestParam("did") int did);
}
