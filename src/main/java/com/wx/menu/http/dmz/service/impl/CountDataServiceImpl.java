package com.wx.menu.http.dmz.service.impl;

import com.wx.menu.entity.BillEntity;
import com.wx.menu.http.dmz.mapper.CountDataMapper;
import com.wx.menu.http.dmz.service.CountDataService;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
@Service("CountDataServiceImpl")
public class CountDataServiceImpl implements CountDataService {
    @Autowired
    CountDataMapper countDataMapper;

    @Override
    public List<BillEntity> getBill(String page) throws Exception {
        if(StringUtils.isEmpty(page) || !NumberUtils.isNumber(page)){
            return new ArrayList<>();
        }

        return countDataMapper.getBill((Integer.parseInt(page)-1)*8,8);
    }
}
