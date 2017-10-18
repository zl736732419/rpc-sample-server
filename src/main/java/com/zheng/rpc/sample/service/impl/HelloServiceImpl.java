package com.zheng.rpc.sample.service.impl;

import com.zheng.rpc.annotation.RpcService;
import com.zheng.rpc.sample.service.HelloService;

/**
 * 示例服务实现
 * Created by zhenglian on 2017/10/15.
 */
@RpcService(value = "helloService")
public class HelloServiceImpl implements HelloService {
    public String hello(String s) {
        return "rpc i love you !!!";
    }
}
