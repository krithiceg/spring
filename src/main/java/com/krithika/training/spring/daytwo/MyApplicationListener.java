package com.krithika.training.spring.daytwo;

import org.springframework.context.ApplicationListener;

public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("This event is captured" + event.getSource() + event.getEventmessage());
		
	}

}
