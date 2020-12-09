package com.qf.Feiclient;

import Allpojo.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("employee")
public interface EmployeeFei {
    @RequestMapping(value = "/emps",method = RequestMethod.GET)
    public List<Employee> getAllEmp();
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    Employee login(@RequestParam("euser")String username,@RequestParam("epass") String password);
    @RequestMapping(value = "/oneemp",method = RequestMethod.GET)
    Employee getEmpByEid(@RequestParam("eid") int eid);
    @RequestMapping(value = "/deleteemp",method = RequestMethod.GET)
     boolean deleteEmpByEid(@RequestParam("eid") int eid);
    @RequestMapping(value = "/saveemp",method = RequestMethod.GET)
    boolean saveemp(@RequestBody Employee employee);
    @RequestMapping(value = "/updateemp",method = RequestMethod.POST)
    boolean updateemp(@RequestBody Employee employee);
    @RequestMapping(value = "/empCount",method = RequestMethod.GET)
    int empCount();
}
