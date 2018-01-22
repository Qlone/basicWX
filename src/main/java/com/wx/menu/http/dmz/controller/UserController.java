package com.wx.menu.http.dmz.controller;

import com.wx.menu.entity.BillEntity;
import com.wx.menu.http.dmz.service.UserService;
import com.wx.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/m/user")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/id")
    public Object getUserId(ModelAndView modelAndView,
                          @RequestParam(value = "activeCode")String activeCode){
        try {
            String res = userService.getUserId(activeCode);
            modelAndView.addObject("res",res);
        } catch (Exception e) {
            LogUtil.context(this).error("获取出错",e);
        }
        return modelAndView.getModel();
    }
}
