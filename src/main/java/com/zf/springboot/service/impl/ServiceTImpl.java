package com.zf.springboot.service.impl;

import com.zf.springboot.manager.bean.User;
import com.zf.springboot.service.ServiceT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zf on 2017/11/20 0020.
 */

@Service
public class ServiceTImpl implements ServiceT{
    @Autowired
    private User user;
    @Override
    public String testT() {
        return user.toString();
    }
}
