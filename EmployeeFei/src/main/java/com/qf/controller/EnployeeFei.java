package com.qf.controller;

import Allpojo.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qf.Feiclient.EmployeeFei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnployeeFei {
    @Autowired
    private EmployeeFei ef;
    @RequestMapping(value = "/emps",method = RequestMethod.GET)
    public List<Employee> getAllEmp(){
        return ef.getAllEmp();
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)

    public Employee login(@RequestParam(value = "euser") String username, @RequestParam(value = "epass") String password){
        System.out.println(username);
        return ef.login(username,password);
    }

    @RequestMapping(value = "/oneempl")
    @HystrixCommand(fallbackMethod = "abc")
    public Employee getEmpByEid(@RequestParam("eid") int eid){
        //System.out.println(10/0);
        return ef.getEmpByEid(eid);
    }
    public Employee abc(@RequestParam("eid") int eid) {
        return null;
    }

    @RequestMapping(value = "/deleteemp",method = RequestMethod.GET)
    boolean deleteEmpByEid(@RequestParam("eid") int eid){
        return ef.deleteEmpByEid(eid);
    }
    @RequestMapping(value = "/updateemp",method = RequestMethod.POST)
    boolean updateemp(Employee employee){
        System.out.println(employee);
        return ef.updateemp(employee);
    }

    @RequestMapping(value = "/saveemp",method = RequestMethod.POST)
    boolean saveEmp(Employee employee){
        System.out.println(employee);
        return ef.saveemp(employee);
    }

    @RequestMapping(value = "/123",method = RequestMethod.GET)
    int empCount(){
        return ef.empCount();
    }


}
