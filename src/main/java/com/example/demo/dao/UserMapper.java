package com.example.demo.dao;

import com.example.demo.model.User;
import com.example.demo.model.UserCountByCreateTimeResp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper {
	
    int deleteUserById(String id);

    int insertUser(User record);

    User findUser(User record);

    int updateUser(User record);
    
    int countUserByName(String name);
    
    List<User> findUserList(User record);

    List<UserCountByCreateTimeResp> countUserCreateTimeByMonth();

    String procUserLoginLog(Map record);

    Integer procUpdateUserErrorCount(Map record);

}