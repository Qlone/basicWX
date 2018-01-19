package com.wx.menu.http.dmz.service;

import com.wx.menu.entity.TypeEntity;

import java.math.BigDecimal;
import java.util.List;

public interface SubmitService {
    void test();


    boolean insertBill(String type, BigDecimal money, boolean newType) throws Exception;

    boolean insertType(String type) throws Exception;

    /**
     * 获取类型
     * @return
     * @throws Exception
     */
    List<TypeEntity> getTypeList() throws Exception;
}
