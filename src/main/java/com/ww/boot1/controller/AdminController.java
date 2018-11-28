package com.ww.boot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuwei
 * @create 2018/11/28 9:54
 * @desc
 **/
@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/index")
    public String index() {
        return "admin/index";
    }

    @GetMapping("/info")
    public String info() {
        return "admin/info";
    }
}