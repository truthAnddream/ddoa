package com.qf.controller;

import Allpojo.Department;
import com.qf.Feiclient.DEpartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DepartmentFei {
    @Autowired
    DEpartment aet;
    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Department> getAll(){
        return aet.getAll();
    }
    @RequestMapping(value = "saveDep",method = RequestMethod.POST)
    public boolean saveDep( Department department){
        return aet.saveDep(department);
    }
    @RequestMapping(value = "deleteDep",method = RequestMethod.GET)
    public boolean deleteDep(@RequestParam("did")int did){
        return aet.deleteDep(did);
    }
    @RequestMapping(value = "updateDep",method = RequestMethod.POST)
    public boolean updateDep(Department department){
        return aet.updateDep(department);
    }
    @RequestMapping(value = "findOne",method = RequestMethod.GET)
    public Department findOne(@RequestParam("did")int did){
      return   aet.findOne(did);
    }
}
