package com.krithika.training.spring.dayone;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.krithika.training.spring.daytwo.MyApplicationEvent;
import com.krithika.training.spring.daytwo.MyApplicationEvent2;

public class HelloWorldXml
{
	
	public String hello() throws IOException {
		Resource resource = new ClassPathResource("com/krithika/training/spring/dayone/hellofile.txt");
		
		return IOUtils.toString(resource.getInputStream());
		
	}

	public static void main(String args[]) throws IOException {
		//BeanFactory bf = new XmlBeanFactory(new ClassPathResource("/spring/context-spring-core.xml"));
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("/spring/context-spring-core.xml");
		
		/*HelloWorld hw = (HelloWorld) appCtx.getBean("helloWorld");
		System.out.println(hw.hello());*/
		appCtx.publishEvent(new MyApplicationEvent(new Object(),"Hello"));
		
		System.out.println("break");
		
		appCtx.publishEvent(new MyApplicationEvent2(new Object()));
	}
}
