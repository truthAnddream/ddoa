package com.qf.controller;


import Allpojo.Massage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qf.service.MassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
public class MassageController {
    @Autowired
    MassageService ms;
//    @Autowired
////    WriteXLS writeXLS;
//    @GetMapping("getAllMassage")
//    public List<Massage> getAllMassage(int deleteid){
//
//        return ms.GetAllMassage(deleteid);
//    }

    @GetMapping("getAllMassage")
    public List<Massage> getAllMassage(int deleteid){

        return ms.GetAllMassage(deleteid);
    }
    @GetMapping("MoveMassage")
    public int MoveMassage(@RequestParam("deleteid")int deleteid,@RequestParam("eid") int eid){
//        String deleteid=request.getParameter("deleteid");
//        String eid=request.getParameter("eid");
        System.out.println(deleteid);
        System.out.println(eid);
        return ms.MoveMassage(deleteid,eid);

    }
    @GetMapping("deleteMassage")
    public int delete(int eid){
        System.out.println(eid);
        return ms.delete(eid);
    }
//        @PostMapping("update")
//    public int update(@RequestBody Map map){
//            Object massages = map.get("massage");
//            String s=JSON.toJSONString(massages);
//            Massage massage=JSONObject.parseObject(s,Massage.class);
//            System.out.println(massage);
//       return ms.Update(massage);
//    }
    @PostMapping("update")
    public int update(@RequestBody Massage massage){
        System.out.println(massage);
        return ms.Update(massage);
    }
//    @RequestMapping("writeExcel")
//    public String WriteExcel(int deleteid){
//        List<Massage> userList = ms.GetAllMassage(deleteid);
//        System.out.println (userList);
//        writeXLS.exportExcel (userList);
//        return "成功";
//    }
}
