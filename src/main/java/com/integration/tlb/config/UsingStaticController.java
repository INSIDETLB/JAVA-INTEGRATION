package com.integration.tlb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 访问静态资源
 * @author apple
 *
 */
@Configuration
public class UsingStaticController extends WebMvcConfigurationSupport {
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/SSOPersonnelLogin/static/**").addResourceLocations("classpath:/static/");
    }
	
}
