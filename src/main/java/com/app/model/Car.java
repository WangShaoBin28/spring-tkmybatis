package com.app.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "userId")
    private Integer userId;//用户ID

    @Column(name = "pinCode")
    private String pinCode;//手机唯一编号

    @Column(name = "goodsNumber")
    private Integer goodsNumber;//商品的购买数量

}
