package com.example.demo334;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


//@SpringBootApplication(exclude = MybatisAutoConfiguration.class)

@SpringBootApplication
@MapperScan("com.example.demo334.dao")


public class Demo334Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo334Application.class, args);
    }
}
