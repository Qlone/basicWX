package com.wx.menu.http.dmz.controller;

import com.wx.menu.http.dmz.service.SubmitService;
import com.wx.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SubmitController {
    @Autowired
    SubmitService submitService;

    @ResponseBody
    @RequestMapping("/")
    public String incomeSumbit(){

        submitService.test();
        return "ss";
    }
}
