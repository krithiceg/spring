package com.krithika.training.spring.dayone;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.krithika.training.spring.config.DayOneJavaConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DayOneJavaConfig.class)
//@ContextConfiguration("HelloWorld-context.xml")
public class HelloWorldTest {

	@Test
	public void whileHello_returnCorrectContents() throws IOException {
		//given
		HelloWorld helloWorld = new HelloWorld();
		//when
		String contents = helloWorld.hello();
		//then
		assertThat(contents, equalTo("Hello"));
	}
	
	/*@Test
	public void helloWorldIsNotNull() {
		Assert.assertNotNull(hw);
	}
	
	@Test
	public void get_text_through_java_configured_bean_from_helloworldtext() throws IOException {
		//HelloWorldTexter hwt = new HelloWorldTexter();
		assertThat(hw.hello(), equalTo("Hello"));
	}*/
	
	/*@Test
	public void helloWorldIsNotNullFromHelloWorldTester () {
		HelloWorldTexter hwt = new HelloWorldTexter();
		HelloWorld hw1 = hwt.getHelloWorld();
		Assert.assertNotNull(hw1);
	}
	
	@Test
	public void get_text_through_java_configured_bean() throws IOException {
		ApplicationContext ctx = 
			      new AnnotationConfigApplicationContext(HelloWorld.class);
				//new ClassPathXmlApplicationContext("/beans.xml");
		//helloWorld = ctx.getBean(HelloWorld.class);
		HelloWorld hw = ctx.getBean("helloWorld", HelloWorld.class);
		String contents = hw.hello();
		
		HelloWorldTexter hwt = new HelloWorldTexter();
		String contents = hwt.getHelloWorldText();
		assertThat(contents, equalTo("Hello"));
	}
	*/
	
	
}
