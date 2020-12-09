package com.qf.controller;


import Allpojo.Employee;
import com.alibaba.fastjson.JSON;
import com.qf.service.IEmployeeService;
//import com.qf.util.faceutil;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @GetMapping("jsp")
    public String aaa(){
        return "login";
    }

    @GetMapping("/emps")
    public List<Employee> getAllEmp(){
        return employeeService.getAllEmp();
    }

    @PostMapping("/login")
    public Employee login(@RequestParam("euser") String username, @RequestParam("epass") String password) {
        Employee login = employeeService.login(username, password);
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(euser, epass);
//        subject.login(token);
//        if (subject.isAuthenticated()){
//            System.out.println("ele"+subject.hasRole("employee"));
//            System.out.println("man"+subject.hasRole("manager"));
        return login;
    //}
//        if (login!=null){
//            System.out.println("login succeed!");
//            return login;
//        }else{
//            System.out.println("login failure!");
//            return null;
//        }
        //return null;
    }
//@ResponseBody
//    @PostMapping("/face")
//    public void loginFace(HttpServletRequest request, HttpServletResponse response){
//        response.setContentType("text/html;charset=UTF-8");
//        try {
//            request.setCharacterEncoding("UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        response.setCharacterEncoding("UTF-8");
//        response.getHeader("textml; charset=UTF-8");
//        //实例化PrintWriter对象
//        PrintWriter out = null;
//        try {
//            out = response.getWriter();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String img = request.getParameter("img");
//        JSONObject js = faceutil.searchFace(img, "register", "1");
//        System.out.println(js.toString(2));
//        out.print(js);
//    }

    @GetMapping("/oneemp")
    public Employee getEmpByEid(@RequestParam("eid") int eid){
        System.out.println(eid);
        System.out.println(employeeService.getEmpByEid(eid));
        return employeeService.getEmpByEid(eid);
    }

    @GetMapping("/deleteemp")
    public boolean deleteEmpByEid(@RequestParam("eid") int eid){
        return employeeService.deleteEmpByEid(eid);
    }

    @PostMapping("/saveemp")
     public boolean saveEmp(@RequestBody Employee employee){
        return employeeService.saveEmp(employee);
    }
//    @PostMapping("/saveemp")
//    public boolean saveemp(Employee employee){
//        return employeeService.updateEmp(employee);
//    }
    @PostMapping("/updateemp")
    public boolean updateEmpByEid(@RequestBody  Employee employee){
        System.out.println();
        String s= JSON.toJSONString(employee);
        System.out.println(s);
        return employeeService.updateEmp(employee);
    }
    @GetMapping("empCount")
    public int empCount(){
        return employeeService.empCount();
    }

}
