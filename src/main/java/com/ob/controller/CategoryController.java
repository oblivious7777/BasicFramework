package com.ob.controller;


import com.ob.service.CategoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(value = "",method = RequestMethod.GET)
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    //设置log4j
    static Logger logger = Logger.getLogger(CategoryController.class);

    @RequestMapping(value = "0", method = RequestMethod.GET)
    public String tetView(Model model) {
        int listState=categoryService.list();
        model.addAttribute("listState",listState);

        return "test";
    }
}