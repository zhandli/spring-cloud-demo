package com.example.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zh
 * @date 2021/8/14 9:27
 */
@RestController
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sayHi")
    public String sayHi() {
        return restTemplate.getForObject("http://eureka-client/sayHi", String.class);
    }
}
