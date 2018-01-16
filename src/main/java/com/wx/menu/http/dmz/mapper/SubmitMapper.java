package com.wx.menu.http.dmz.mapper;

import org.apache.ibatis.annotations.Insert;

public interface SubmitMapper {

    @Insert("INSERT INTO wx_user(id_user,name) VALUES(REPLACE(UUID(),'-',''),#{name})")
    void insertTest(String name);
}
