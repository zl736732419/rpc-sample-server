package com.zheng.rpc.sample.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhenglian on 2017/10/18.
 */
public class Boostrap {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:spring.xml");
    }
}
