package com.krithika.training.spring.dayone;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

//@Component - not needed for creating bean through java config
//@Component
public class HelloWorld {
	private String classpathFileName;

	/**
	 * @param classpathFileName the classpathFileName to set
	 */
	public void setClasspathFileName(String classpathFileName) {
		this.classpathFileName = classpathFileName;
	}

	public String hello() throws IOException {
		Resource resource = new ClassPathResource("com/krithika/training/spring/dayone/hellofile.txt");
		
		return IOUtils.toString(resource.getInputStream());
		
	}
	
	public static void main(String args[]) throws IOException {
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.hello());
	}
	
}
