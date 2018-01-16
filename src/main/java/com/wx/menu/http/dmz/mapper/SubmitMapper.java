package com.wx.menu.http.dmz.mapper;

import com.wx.menu.entity.BillEntity;
import org.apache.ibatis.annotations.Insert;

public interface SubmitMapper {

    @Insert("INSERT INTO wx_user(id_user,name) VALUES(REPLACE(UUID(),'-',''),#{name})")
    void insertTest(String name);

    /**
     * 插入账单
     * @param billEntity
     * @return
     */
    @Insert("INSERT INTO bill(id_bill,id_user,type,money,created_date)" +
            " VALUES(REPLACE(UUID(),'-','') , #{idUser} , #{type} , #{money} , NOW())")
    int insertBill(BillEntity billEntity) throws Exception;
}
