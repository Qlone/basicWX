package com.wx.menu.http.dmz.controller;

import com.wx.menu.http.dmz.service.SubmitService;
import com.wx.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;

@Controller("SubmitController")
@RequestMapping("/menu")
public class SubmitController {
    @Autowired
    SubmitService submitService;

    @ResponseBody
    @RequestMapping("/income")
    public String test(){

        return "ss";
    }
    @ResponseBody
    @RequestMapping("/s")
    public Object incomeSumbit(ModelAndView modelMap,
            @RequestParam(required = false,value = "type")String type,
            @RequestParam(required = false,value = "money")BigDecimal money){
        try {
            boolean res = submitService.insertBill(type, money);

            modelMap.addObject("res", res);
        }catch (Exception e){
            LogUtil.context(this).error("报错",e);
            modelMap.addObject("res", false);
        }
        return modelMap.getModel();
    }
}