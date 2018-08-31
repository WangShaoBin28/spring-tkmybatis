package com.app.dao;

import com.app.config.BaseMapper;
import com.app.model.Car;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CarMapper extends BaseMapper<Car> {
}
