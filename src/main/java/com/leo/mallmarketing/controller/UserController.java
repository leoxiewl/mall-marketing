package com.leo.mallmarketing.controller;

import com.leo.mallmarketing.common.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test")
    public R<String> test() {
        return R.success("test");
    }
}
