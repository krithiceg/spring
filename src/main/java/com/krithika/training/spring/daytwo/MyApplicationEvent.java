package com.krithika.training.spring.daytwo;

public class MyApplicationEvent extends MyParentEvent {

	private String eventmessage;
	


	public MyApplicationEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}


	public MyApplicationEvent(Object source, String message) {
		super(source);
		this.eventmessage = message;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the eventmessage
	 */
	public String getEventmessage() {
		return this.eventmessage;
	}

	/**
	 * @param eventmessage the eventmessage to set
	 */
	public void setEventmessage(String eventmessage) {
		this.eventmessage = eventmessage;
	}

}
