package com.stech.SpringCore;

public class MessageWriter {
	private IMessageProducer iMessageProducer;

	public IMessageProducer getiMessageProducer() {
		return iMessageProducer;
	}

	public void setiMessageProducer(IMessageProducer iMessageProducer) {
		this.iMessageProducer = iMessageProducer;
	}

	public void writeMessage(String message) {
		String mesg = null;
		String writeMessage = iMessageProducer.writeMessage(message);
		System.out.println("Message :" + writeMessage);
	}
}
