package com.qf.Feiclient;

import Allpojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("student")
public interface StudentClient {
    @RequestMapping(value = "getAllStudent",method = RequestMethod.GET)
    public List<Student> getAllStudent();
    @RequestMapping(value = "saveStudent",method = RequestMethod.POST)
    public boolean saveStudent(@RequestBody Student s);
    @RequestMapping(value = "selectStudentByUid",method = RequestMethod.GET)
    public Student selectStudentByUid(@RequestParam("uid") int uid);
    @RequestMapping(value = "deleteStudent",method = RequestMethod.GET)
    public String deleteStudent(@RequestParam("uid")int uid);
    @RequestMapping(value = "updateStudent",method = RequestMethod.POST)
    public String updateStudent(@RequestBody Student s);

}
