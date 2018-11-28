package com.ww.boot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author wuwei
 * @create 2018/11/28 9:53
 * @desc
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/info")
    public Object info(Principal principal) {
        return principal;
    }

    @GetMapping("/hello1")
    public String hello() {
        return "hello1";
    }


}
