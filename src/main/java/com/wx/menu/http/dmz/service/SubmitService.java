package com.wx.menu.http.dmz.service;

import java.math.BigDecimal;

public interface SubmitService {
    void test();

    boolean insertBill(String type, BigDecimal money) throws Exception;
}
