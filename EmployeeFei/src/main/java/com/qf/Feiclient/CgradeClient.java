package com.qf.Feiclient;

import Allpojo.Cgrade;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient("cgrade")
public interface CgradeClient {
    @RequestMapping(value = "getAllCrade",method = RequestMethod.GET)
    public List<Cgrade> getAllCgrade();
    @RequestMapping(value = "saveCrade",method = RequestMethod.POST)
    public boolean saveCrade(@RequestBody Cgrade c);
    @RequestMapping(value = "selectCrade",method = RequestMethod.GET)
    public Cgrade selectCrade(@RequestParam("cid")int cid);
    @RequestMapping(value = "deleteCrade",method = RequestMethod.GET)
    public boolean deleteCrade(@RequestParam("cid") int cid);
    @RequestMapping(value = "updateCrade",method = RequestMethod.POST)
    public boolean updateCrade(@RequestBody Cgrade c);
}
