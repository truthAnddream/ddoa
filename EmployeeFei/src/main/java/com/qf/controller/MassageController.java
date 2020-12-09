package com.qf.controller;

import Allpojo.Massage;
import com.qf.Feiclient.MassageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MassageController {
@Autowired
    MassageClient msc;
    @RequestMapping(value = "getAllMassage",method = RequestMethod.GET)
    public String getAllMassage(@RequestParam("deleteid") int deleteid){
        return msc.getAllMassage(deleteid);
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String upDateMassage(Massage massage){
        return msc.upDateMassage(massage);
    }
    @RequestMapping(value = "deleteMassage",method = RequestMethod.GET)
    public String deleteMassage(@RequestParam("eid") int eid){
        return msc.deleteMassage(eid);
    }
    @RequestMapping(value = "MoveMassage",method = RequestMethod.GET)
    public String MoveMassage(@RequestParam("deleteid")int deleteid,@RequestParam("eid") int eid){
        System.out.println("de"+deleteid+"eid"+eid);
        return msc.MoveMassage(deleteid, eid);
    }
}
