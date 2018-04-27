package com.trial.staffe.serviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 服务注册中心
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ServiceConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigApplication.class, args);
    }
}
