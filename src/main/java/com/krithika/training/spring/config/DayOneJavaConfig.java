package com.krithika.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.krithika.training.spring.dayone.HelloWorldJavaConf;

@Configuration
public class DayOneJavaConfig {

	@Bean
	public HelloWorldJavaConf helloWorldJavaConf() {
		return new HelloWorldJavaConf();
	}
	
	
}
