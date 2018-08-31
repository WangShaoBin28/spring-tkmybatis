package com.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.app.dao")
public class SpringTkmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTkmybatisApplication.class, args);
    }
}
