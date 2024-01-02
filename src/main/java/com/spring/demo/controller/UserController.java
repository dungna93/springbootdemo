package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @created: 02/01/2024 - 10:10 PM
 * @author: dungna
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/id")
    public String getUser() {
        return "Thành công";
    }
}
