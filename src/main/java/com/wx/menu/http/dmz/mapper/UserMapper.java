package com.wx.menu.http.dmz.mapper;

import com.wx.menu.entity.UserEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    @Select("SELECT id_user as idUser FROM wx_user" +
            " WHERE active_code = #{activeCode}")
    List<UserEntity> getUser(UserEntity userEntity) throws Exception;
}
