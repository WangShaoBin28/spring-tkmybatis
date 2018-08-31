package com.app.dao;

import com.app.config.BaseMapper;
import com.app.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {

    User getUser(Integer id);
}
