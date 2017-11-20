package com.zf.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zf on 2017/11/20 0020.
 */
@RestController
public class ControllerT {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello world..";
    }

}
