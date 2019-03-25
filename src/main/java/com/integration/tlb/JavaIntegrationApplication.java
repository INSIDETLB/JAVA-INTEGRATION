package com.integration.tlb;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.integration.tlb.mapper.manual")
public class JavaIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaIntegrationApplication.class, args);
	}

}
