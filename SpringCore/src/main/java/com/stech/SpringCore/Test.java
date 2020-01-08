package com.stech.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		MessageWriter messagebean = context.getBean(MessageWriter.class, "messageWriter");
		messagebean.writeMessage("welcome to hyderabad veeraswamy");

		/**
		 * ApplicationContext context2 = new
		 * AnnotationConfigApplicationContext("AppConfig.class"); MessageWriter bean =
		 * context2.getBean(MessageWriter.class); System.out.println(bean);
		 */
        
	}
}
