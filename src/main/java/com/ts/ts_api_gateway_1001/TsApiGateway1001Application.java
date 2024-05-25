package com.ts.ts_api_gateway_1001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TsApiGateway1001Application {

	public static void main(String[] args) {
		SpringApplication.run(TsApiGateway1001Application.class, args);
		
		System.out.println("ts-api-gateway-1001 started on port number: 8060");
	}

}
