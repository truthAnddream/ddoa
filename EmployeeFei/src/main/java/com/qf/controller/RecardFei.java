package com.qf.controller;

import Allpojo.Leave;
import Allpojo.Matter;
import Allpojo.Record;
import com.qf.Feiclient.Recardclient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecardFei {
    @Autowired
    Recardclient rclt;
    @RequestMapping(value = "saveLeave",method = RequestMethod.POST)
    public boolean saveLeave( Leave leave){
        return rclt.saveLeave(leave);
    }
    @RequestMapping(value = "deletematter",method = RequestMethod.GET)
    public boolean deleteMatter(@RequestParam("mid") int mid){
        return rclt.deleteMatter(mid);
    }
    @RequestMapping(value = "getMatter",method = RequestMethod.GET)
    public List<Matter> getAll(){
        return rclt.getAll();
    }
    @RequestMapping(value = "getRecord",method = RequestMethod.GET)
    public List<Record> getAllRecord(){
        return rclt.getAllRecord();
    }
}
