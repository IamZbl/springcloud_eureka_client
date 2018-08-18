package com.bigdog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 创建服务提供方
 * @author Administrator
 *
 */
@SpringBootApplication
//该注解能激活Eureka中的DiscoveryClient实现，才能实现Controller对服务信息的输出
@EnableDiscoveryClient
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
