package com.krithika.training.spring.daytwo;

import org.springframework.context.ApplicationListener;

public class MyNewApplicationListener implements ApplicationListener<MyParentEvent> {

	@Override
	public void onApplicationEvent(MyParentEvent event) {
		System.out.println("Listening to event: " + event.getClass());
		
	}

	
}
