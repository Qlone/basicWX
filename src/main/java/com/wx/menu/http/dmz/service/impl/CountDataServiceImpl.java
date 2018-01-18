package com.wx.menu.http.dmz.service.impl;

import com.wx.menu.entity.BillEntity;
import com.wx.menu.http.dmz.mapper.CountDataMapper;
import com.wx.menu.http.dmz.service.CountDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("CountDataServiceImpl")
public class CountDataServiceImpl implements CountDataService {
    @Autowired
    CountDataMapper countDataMapper;

    @Override
    public List<BillEntity> getBill() throws Exception {
        return countDataMapper.getBill();
    }
}
