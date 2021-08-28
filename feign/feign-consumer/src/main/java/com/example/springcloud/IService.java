package com.example.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zh
 * @date 2021/8/25 8:19
 */
@FeignClient("eureka-client")
public interface IService {
    /**
     * 远程方法调用
     *
     * @return
     */
    @GetMapping("sayHi")
    public String sayHi();
}
