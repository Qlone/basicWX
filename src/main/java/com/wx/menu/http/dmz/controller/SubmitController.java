package com.wx.menu.http.dmz.controller;

import com.wx.util.LogUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SubmitController {

    @ResponseBody
    @RequestMapping("/")
    public String incomeSumbit(){

        LogUtil.context(this).error("打印。。。。。。");
        return "ss";
    }
}
