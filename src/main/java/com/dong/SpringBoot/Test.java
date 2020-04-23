package com.dong.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
@Controller
public class Test {
    public static void main(String[] args) {
        SpringApplication.run();
    }

    @RequestMapping("tt.do")
    @ResponseBody
    public Map test(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","val");
        return map;
    }

    @RequestMapping("/pp")
    public String test2(){
        System.out.println("kkkkkkk");
        return "index";
    }

}
