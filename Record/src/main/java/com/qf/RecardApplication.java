package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //用于启动服务发现功能
@SpringBootApplication
public class RecardApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecardApplication.class);
    }
}
