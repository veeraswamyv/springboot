package com.stech.SpringCore;

public class PDFMessageWriter implements IMessageProducer {

	public String writeMessage(String message) {
		return "<PDF>" + message + "<PDF>";
	}

}
