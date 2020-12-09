package com.qf.controller;

import Allpojo.Record;
import com.qf.service.RecordSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecordController {
    @Autowired
    private RecordSrvice recordSrvice;
    @GetMapping("/getRecord")
    public List<Record> getAllRecord(){
        return recordSrvice.getAllRecord();
    }
}
