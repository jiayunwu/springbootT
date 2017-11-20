package com.zf.springboot.controller;

import com.zf.springboot.manager.bean.User;
import com.zf.springboot.service.ServiceT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zf on 2017/11/20 0020.
 */
@RestController
public class ControllerS {
    @Autowired
    private ServiceT serviceT;
    @RequestMapping("/test")
    public String test() {
        return serviceT.testT();
    }

}
