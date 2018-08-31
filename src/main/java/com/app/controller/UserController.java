package com.app.controller;

import com.app.dao.CarMapper;
import com.app.dao.UserMapper;
import com.app.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserMapper userMapper;
    @Autowired
    private CarMapper carMapper;

    @RequestMapping("getUser")
    public User getUser(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @RequestMapping("list")
    public PageInfo<User> list() {
        PageHelper.startPage(1, 10);
        List<User> users = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        log.debug(userPageInfo.toString());
        return userPageInfo;
    }
}
