package com.young.youngmusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author error-codes 【BayMax】
 * @see <a href="www.error-codes.xyz">BayMax Blog</a>
 * @since 2022/5/18 16:59
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hi")
    public String sayHi() {
        return new String("HI, I‘m YoungMusic!");
    }
}
