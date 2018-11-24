package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.User;
import com.example.demo.model.UserCountByCreateTimeResp;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by liulanhua on 2018/9/25.
 */
@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value="",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv) throws Exception {
        mv.addObject("record", "this is index page");
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value="user/countUserCreateTimeByMonth",method = RequestMethod.GET)
    public ModelAndView findUser(ModelAndView model) throws Exception {
        //JSONObject record = userService.countUserCreateTimeByMonth();

        String  recordStr = "{\"month_4\":2,\"month_6\":1,\"month_5\":4,\"month_8\":1,\"month_7\":2,\"month_9\":1}";
        JSONObject record = JSONObject.parseObject(recordStr);

        model.addObject("users", record);
        model.setViewName("user");
        return model;
    }





}
