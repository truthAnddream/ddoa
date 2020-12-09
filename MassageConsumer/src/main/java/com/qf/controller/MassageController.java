package com.qf.controller;

import Allpojo.Massage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MassageController {
@Autowired
    RestTemplate restTemplate;
@GetMapping("getAllMassage")
public String getAllMassage(int deleteid){
    return restTemplate.getForObject("http://massage/getAllMassage?deleteid="+deleteid,String.class);
}
    @PostMapping("upDateMassage")
    public String upDateMassage(Massage massage){
        Map<String,Massage> map=new HashMap<>();
        map.put("massage",massage);
        return restTemplate.postForObject("http://massage/update",map,String.class);
    }
    @GetMapping("deleteMassage")
    public String deleteMassage(int eid){
        return restTemplate.getForObject("http://massage/delete?eid"+eid,String.class);
    }
    @GetMapping("MoveMassage")
    public String MoveMassage(int deleteid, int eid){
        return restTemplate.getForObject("http://massage/MoveMassage?eid"+eid+"&deleteid"+deleteid,String.class);
    }
}
