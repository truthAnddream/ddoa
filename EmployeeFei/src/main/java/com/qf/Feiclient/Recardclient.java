package com.qf.Feiclient;

import Allpojo.Leave;
import Allpojo.Matter;
import Allpojo.Record;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("recard")
public interface Recardclient {
    @RequestMapping(value = "saveLeave",method = RequestMethod.POST)
    public boolean saveLeave(@RequestBody Leave leave);
    @RequestMapping(value = "deletematter",method = RequestMethod.GET)
    public boolean deleteMatter(@RequestParam("mid") int mid);
    @RequestMapping(value = "getMatter",method = RequestMethod.GET)
    public List<Matter> getAll();
    @RequestMapping(value = "getRecord",method = RequestMethod.GET)
    public List<Record> getAllRecord();
//    @RequestMapping(value = "",method = RequestMethod.POST)
//    public boolean saveLeave(@RequestBody Leave leave);
}
