package com.qf.controller;

import Allpojo.Cgrade;
import com.qf.Feiclient.CgradeClient;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CgradeFei {
    @Autowired
    CgradeClient cgradeClient;
    @RequestMapping(value = "getAllCrade",method = RequestMethod.GET)
    public List<Cgrade> getAllCgrade(){

        return cgradeClient.getAllCgrade();
    }
    @RequestMapping(value = "saveCrade",method = RequestMethod.POST)
    public boolean saveCrade(Cgrade c){
        System.out.println(c);
        return cgradeClient.saveCrade(c);
    }
    @RequestMapping(value = "selectCrade",method = RequestMethod.GET)
    public Cgrade selectCrade(@RequestParam("cid") int cid){
        return cgradeClient.selectCrade(cid);
    }
    @RequestMapping(value = "deleteCrade",method = RequestMethod.GET)
    public boolean deleteCrade(@RequestParam("cid") int cid){
        return cgradeClient.deleteCrade(cid);
    }
    @RequestMapping(value = "updateCrade",method = RequestMethod.POST)
    public boolean updateCrade(Cgrade c){
        return cgradeClient.updateCrade(c);
    }
}
