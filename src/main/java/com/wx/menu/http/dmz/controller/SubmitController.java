package com.wx.menu.http.dmz.controller;

import com.wx.menu.entity.TypeEntity;
import com.wx.menu.http.dmz.service.SubmitService;
import com.wx.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller("SubmitController")
@RequestMapping("/menu")
public class SubmitController {
    @Autowired
    SubmitService submitService;

    @ResponseBody
    @RequestMapping("/income")
    public Object incomeSumbit(ModelAndView modelMap,
                               @RequestParam(required = false,value = "type")String type,
                               @RequestParam(required = false,value = "money")String money,
                               @RequestParam(required = false,value = "newType")boolean newType){
        try {
            BigDecimal bigDecimal = BigDecimal.valueOf(Double.valueOf(money));
            boolean res = submitService.insertBill(type, bigDecimal,newType);

            modelMap.addObject("res", res);
        }catch (Exception e){
            LogUtil.context(this).error("报错",e);
            modelMap.addObject("res", false);
        }
        return modelMap.getModel();
    }

    @ResponseBody
    @RequestMapping("/type")
    public Object getTypeList(ModelAndView modelAndView){
        List<TypeEntity> res = null;
        try {
            res = submitService.getTypeList();
        } catch (Exception e) {
            LogUtil.context(this).error("获取类型出错",e);
            res = new ArrayList<>();
        }
        modelAndView.addObject("res",res);
        return modelAndView.getModel();
    }
}
