package com.zuoshangs.springclouddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zuoshangs on 2019/7/19.
 */
@Controller
public class DemoController {
    @ResponseBody
    @RequestMapping(value = "/")
    public Map<String,Object> demo() {
        Map<String,Object> map = new HashMap<>();
        map.put("resultCode","002");
        map.put("errorCode","");
        map.put("summary","");
        return map;
    }
}
