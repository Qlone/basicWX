package com.wx.menu.http.dmz.service.impl;

import com.wx.menu.entity.BillEntity;
import com.wx.menu.http.dmz.mapper.SubmitMapper;
import com.wx.menu.http.dmz.service.SubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("SubmitServiceImpl")
public class SubmitServiceImpl implements SubmitService {
    @Autowired
    SubmitMapper submitMapper;
    @Override
    public void test(){
        submitMapper.insertTest("hello");
    }

    @Override
    public boolean insertBill(String type, BigDecimal money) throws Exception {
        if(type == null || money == null){
            return false;
        }
        //保存bill
        BillEntity billEntity = new BillEntity();
        billEntity.setType(type);
        billEntity.setMoney(money);

        int res = submitMapper.insertBill(billEntity);
        return res > 0;
    }
}
