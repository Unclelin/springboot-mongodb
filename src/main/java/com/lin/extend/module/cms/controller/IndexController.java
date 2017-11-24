package com.lin.extend.module.cms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tom-lin
 * @Description:
 * @Date: Create in 00:05 17/7/2
 * @Modified by:
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("--------");
        return "hello world";
    }
}
