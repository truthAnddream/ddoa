package com.qf.controller;

import Allpojo.Cgrade;
import com.qf.service.ICgradeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CgradeController {
    @Autowired
    private ICgradeService cgradeService;
    @GetMapping("/getAllCrade")
    public List<Cgrade> getAllCgrade(){
        return cgradeService.getAllCgrade();
    }
    @PostMapping("/saveCrade")
    public boolean saveCrade(@RequestBody  Cgrade c){
       return cgradeService.saveCgrade(c); }
    @GetMapping("/selectCrade")
    public Cgrade selectCrade(@RequestParam("cid")int cid){
        return cgradeService.selectCrade(cid);
    }

    @GetMapping("/deleteCrade")
    public boolean deleteCrade(@RequestParam("cid")int cid){
        return cgradeService.deleteCrade(cid);
    }
    @PostMapping("/updateCrade")
    public boolean updateCrade(@RequestBody Cgrade c){
        System.out.println(c);
        return  cgradeService.updateCrade(c);
    }
}
