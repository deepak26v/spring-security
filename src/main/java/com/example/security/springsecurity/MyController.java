package com.example.security.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deepakvalechha on 01/08/18.
 */
@RestController
@RequestMapping("/rest")
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world !!";
    }
}
