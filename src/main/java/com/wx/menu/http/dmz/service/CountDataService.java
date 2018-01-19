package com.wx.menu.http.dmz.service;

import com.wx.menu.entity.BillEntity;

import java.util.List;

public interface CountDataService {

    List<BillEntity> getBill(String page) throws Exception;
}
