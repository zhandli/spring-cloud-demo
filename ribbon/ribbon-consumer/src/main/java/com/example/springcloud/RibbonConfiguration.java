package com.example.springcloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RibbonClient的方式为的指定服务配置负载均衡优先级大与配置文件
 *
 * @author zh
 * @date 2021/8/14 10:01
 */
@Configuration
//@RibbonClient(name = "eureka-client", configuration = com.netflix.loadbalancer.RandomRule.class)
public class RibbonConfiguration {

    /**
     * ribbon全局负载均衡策略
     * @return
     */
    @Bean
    public IRule defaultLbStrategy() {
        return new RandomRule();
    }
}
