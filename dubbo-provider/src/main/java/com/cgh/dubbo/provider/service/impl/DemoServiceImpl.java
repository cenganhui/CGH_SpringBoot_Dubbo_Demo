package com.cgh.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cgh.dubbo.api.service.DemoService;

/**
 * @author cenganhui
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", I'm provider!";
    }

}
