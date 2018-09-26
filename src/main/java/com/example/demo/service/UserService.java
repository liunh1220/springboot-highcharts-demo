package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.UserCountByCreateTimeResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
	private UserMapper userMapper;

    public int insertUser(User record){
        return userMapper.insertUser(record);
    }

    public User findUser(User record){
        return userMapper.findUser(record);
    }

    public int updateUser(User record){
        return userMapper.updateUser(record);
    }

    public int countUserByName(String name){
        return userMapper.countUserByName(name);
    }

    public List<User> findUserList(User record){
        return userMapper.findUserList(record);
    }

    public JSONObject countUserCreateTimeByMonth(){
        List<UserCountByCreateTimeResp> list = userMapper.countUserCreateTimeByMonth();
        JSONObject jsonObject = new JSONObject();
        if (!CollectionUtils.isEmpty(list)){
            for (UserCountByCreateTimeResp resp:list){
                jsonObject.put("month_"+resp.getMonth(),resp.getCount());
            }
        }
        return jsonObject;
    }


}