package com.qf.controller;

import Allpojo.Leave;
import com.qf.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {
    @Autowired
    private LeaveService leaveService;
    //添加
    @PostMapping("/saveLeave")
    public boolean saveLeave(@RequestBody Leave leave){
        return leaveService.saveLeave(leave);
    }
}
