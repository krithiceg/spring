package com.krithika.training.spring.dayone;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.krithika.training.spring.config.DayOneJavaConfig;

public class HelloWorldJavaConf {

	
	public String hello() throws IOException {
		Resource resource = new ClassPathResource("com/krithika/training/spring/dayone/hellofile.txt");
		return IOUtils.toString(resource.getInputStream());
	}
	
	public static void main(String args[]) throws IOException {
		HelloWorldJavaConf hwjc;
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(DayOneJavaConfig.class);
		// = new HelloWorldJavaConf();
		hwjc = (HelloWorldJavaConf) appCtx.getBean(HelloWorldJavaConf.class);
		System.out.println(hwjc.hello());
	}
}
