package com.wode.sentinel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 75690
 */
@RestController
@RequestMapping("sentinel")
public class Controller {

    @RequestMapping("test")
    public String test() {
        return "hello";
    }
}
