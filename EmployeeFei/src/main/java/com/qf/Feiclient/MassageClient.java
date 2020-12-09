package com.qf.Feiclient;

import Allpojo.Massage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("massage")
public interface MassageClient {
@RequestMapping(value = "getAllMassage",method = RequestMethod.GET)
public String getAllMassage(@RequestParam("deleteid") int deleteid);
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String upDateMassage(@RequestBody Massage massage);
    @RequestMapping(value = "deleteMassage",method = RequestMethod.GET)
    public String deleteMassage(@RequestParam("eid") int eid);
    @RequestMapping(value = "MoveMassage",method = RequestMethod.GET)
    public String MoveMassage(@RequestParam("deleteid")int deleteid,@RequestParam("eid") int eid);
}
