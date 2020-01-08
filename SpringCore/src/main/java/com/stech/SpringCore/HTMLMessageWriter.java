package com.stech.SpringCore;

public class HTMLMessageWriter implements IMessageProducer {
         
	public String writeMessage(String message) {
		return "<HTML>" + message + "<HTML>";
	}

}
