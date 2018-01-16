package com.wx.menu.http.dmz.service.impl;

import com.wx.menu.http.dmz.mapper.SubmitMapper;
import com.wx.menu.http.dmz.service.SubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SubmitServiceImpl")
public class SubmitServiceImpl implements SubmitService {
    @Autowired
    SubmitMapper submitMapper;
    @Override
    public void test(){
        submitMapper.insertTest("hello");
    }
}
