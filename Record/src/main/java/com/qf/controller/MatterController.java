package com.qf.controller;
import Allpojo.Matter;
import com.qf.service.MatterSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatterController {
    @Autowired
    private MatterSrvice matterSrvice;
    @GetMapping("/getMatter")
    public List<Matter> getAll(){
        return matterSrvice.getAll();
    }
    @GetMapping("/deletematter")
    public boolean deleteMatter(int mid){
        return matterSrvice.deleteMatter(mid);
    }

}
