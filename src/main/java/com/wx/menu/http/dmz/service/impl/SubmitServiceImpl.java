package com.wx.menu.http.dmz.service.impl;

import com.wx.menu.entity.BillEntity;
import com.wx.menu.entity.TypeEntity;
import com.wx.menu.http.dmz.mapper.SubmitMapper;
import com.wx.menu.http.dmz.service.SubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;

@Service("SubmitServiceImpl")
public class SubmitServiceImpl implements SubmitService {
    @Autowired
    SubmitMapper submitMapper;
    @Override
    public void test(){
        submitMapper.insertTest("hello");
    }

    @Override
    @Transactional
    public boolean insertBill(String userId,String type, BigDecimal money,boolean newType) throws Exception {
        if(userId == null || type == null || money == null || money.doubleValue() == 0){
            return false;
        }
        //保存bill
        BillEntity billEntity = new BillEntity();
        billEntity.setType(type);
        billEntity.setMoney(money);
        billEntity.setIdUser(userId);
        int res = submitMapper.insertBill(billEntity);
        if(newType){
            insertType(userId,type);
        }
        return res > 0;
    }
    @Override
    public boolean insertType(String userId,String type) throws Exception{
        if(StringUtils.isEmpty(type)||StringUtils.isEmpty(type)){
            return false;
        }
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setType(type);
        typeEntity.setIdUser(userId);
        int res = submitMapper.insertType(typeEntity);
        return  res > 0;
    }
    @Override
    public List<TypeEntity> getTypeList(String userId) throws Exception {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setIdUser(userId);
        return submitMapper.getTypeList(typeEntity);
    }
}
