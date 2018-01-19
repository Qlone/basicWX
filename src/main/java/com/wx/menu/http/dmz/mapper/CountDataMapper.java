package com.wx.menu.http.dmz.mapper;

import com.wx.menu.entity.BillEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CountDataMapper {

    /**
     * 获取账单
     */
    @Select("SELECT id_user as idUser, money as money, type as type ,created_date as createdDate" +
            " FROM bill" +
            " ORDER BY created_date DESC" +
            " LIMIT #{offset},#{limit}")

    List<BillEntity> getBill(@Param("offset")int offset,@Param("limit") int limit) throws Exception;
}
