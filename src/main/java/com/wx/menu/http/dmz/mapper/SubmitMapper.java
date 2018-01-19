package com.wx.menu.http.dmz.mapper;

import com.wx.menu.entity.BillEntity;
import com.wx.menu.entity.TypeEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    @Insert("INSERT INTO type(id_type,type,created_date)" +
            " VALUES(REPLACE(UUID(),'-','') , #{type} , NOW())")
    int insertType(TypeEntity entity) throws  Exception;

    @Select("SELECT type as type " +
            "  FROM type " +
            " ORDER BY created_date DESC")
    List<TypeEntity> getTypeList(TypeEntity typeEntity) throws Exception;
}
