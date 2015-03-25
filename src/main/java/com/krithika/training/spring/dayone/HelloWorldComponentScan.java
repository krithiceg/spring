package com.krithika.training.spring.dayone;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.krithika.training.spring.config.DayOneAnnotationConfig;

@Component
public class HelloWorldComponentScan {

	/*@Autowired
	SampleObj obj;*/
	
	public String hello() throws IOException {
		Resource resource = new ClassPathResource("com/krithika/training/spring/dayone/hellofile.txt");
		return IOUtils.toString(resource.getInputStream());
	}
	
	public static void main(String args[]) throws IOException {
		HelloWorldComponentScan hwcs;
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DayOneAnnotationConfig.class);
		hwcs = ctx.getBean(HelloWorldComponentScan.class);
		System.out.println(hwcs.hello());
		
	
	}
	
}
