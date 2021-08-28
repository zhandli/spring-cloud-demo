package com.example.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zh
 * @date 2021/8/25 18:55
 */
@RestController
public class Controller {
    /**
     * 注入的是代理类
     */
    @Autowired
    private IService service;

    @GetMapping("sayHi")
    public String sayHi() {
        return service.sayHi();
    }
}
