package com.ob.controller;

import com.ob.service.BasicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BasicController {

    @Resource
    BasicService basicService;


    @RequestMapping("test.do")
    @ResponseBody
    public int AllAreas() {
       int i = basicService.list();
        return i;
    }
}
