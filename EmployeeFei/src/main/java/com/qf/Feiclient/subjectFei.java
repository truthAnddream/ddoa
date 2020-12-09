package com.qf.Feiclient;

import Allpojo.Subject;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("subject")
public interface subjectFei {
    @RequestMapping(value = "/subject",method = RequestMethod.GET)
    List<Subject> getAllSubject();
    @RequestMapping(value = "/onesubject",method = RequestMethod.GET)
    Subject getSubjectBySid( @RequestParam("sid") int sid);
    @RequestMapping(value = "/deletesubject",method = RequestMethod.GET)
    boolean deleteSubjectBySid(@RequestParam("sid") int sid);
    @RequestMapping(value = "/updatesubject",method = RequestMethod.POST)
    boolean updateSubject(@RequestBody Subject subject);
    @RequestMapping(value = "/savesubject",method = RequestMethod.POST)
    boolean saveSubject(@RequestBody Subject subject);

}
