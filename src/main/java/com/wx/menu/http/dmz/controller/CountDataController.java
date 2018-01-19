package com.wx.menu.http.dmz.controller;

import com.wx.menu.entity.BillEntity;
import com.wx.menu.http.dmz.service.CountDataService;
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
@RequestMapping("/data")
public class CountDataController {
    @Autowired
    CountDataService countDataService;

    @ResponseBody
    @RequestMapping("/bill/{page}")
    public Object getBill(ModelAndView modelAndView,
                          @PathVariable String page){
        try {
            List<BillEntity> res = countDataService.getBill(page);
            modelAndView.addObject("res",res);
        } catch (Exception e) {
            LogUtil.context(this).error("获取出错",e);
        }
        return modelAndView.getModel();
    }
}
