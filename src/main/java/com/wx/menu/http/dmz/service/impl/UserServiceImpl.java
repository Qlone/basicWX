package com.wx.menu.http.dmz.service.impl;

import com.wx.menu.entity.UserEntity;
import com.wx.menu.http.dmz.mapper.UserMapper;
import com.wx.menu.http.dmz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public String getUserId(String activeCode) throws Exception {
        if(StringUtils.isEmpty(activeCode)){
            return null;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setActiveCode(activeCode);
        List<UserEntity> userEntities = userMapper.getUser(userEntity);
        if(userEntities.size() > 0){
            return userEntities.get(0).getIdUser();
        }else{
            return null;
        }
    }
}
