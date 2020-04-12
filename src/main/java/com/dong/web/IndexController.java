package com.dong.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
        @ResponseBody
    @RequestMapping("/ppp")
    public String test(){
        System.out.println("kkkkkkk");
        return "index";
    }

    @ResponseBody
    @RequestMapping("/map")
    public Map test2(){
        Map mm = new HashMap();
         mm.put("xx","xxx");
        return mm;

    }

}
