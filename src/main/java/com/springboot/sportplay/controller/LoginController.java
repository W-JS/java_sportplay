package com.springboot.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.springboot.sportplay.bean.User;
import com.springboot.sportplay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        String flag = "error";
        User us = userDao.getUserByMessage(user.getUsername(),user.getPassword());
        HashMap<String, Object> res = new HashMap<>();
        if(us != null){
            flag = "ok";
        }
        res.put("flag",flag);
        res.put("user",us);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }

    //My-Start
    @RequestMapping("/usernamerules")
    public String usernamerules(String username){
        String flag = "error";
        User us = userDao.getUserByUsername(username);
        HashMap<String, Object> res = new HashMap<>();
        if(us != null){
            flag = "success";
        }
        res.put("flag",flag);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
    //My-End
}
