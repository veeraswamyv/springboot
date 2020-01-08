package com.stech.SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name ="MessageWriter")
	public MessageWriter createMessageWriter() {
		IMessageProducer iMessageProducer = null;
		MessageWriter messageWriter = new MessageWriter();
		messageWriter.setiMessageProducer(iMessageProducer);
		return messageWriter;

	}

	@Bean
	public HTMLMessageWriter createHTML() {
		HTMLMessageWriter htmlMessageWriter = new HTMLMessageWriter();
		return htmlMessageWriter;

	}

	@Bean
	public PDFMessageWriter createPDF() {
		PDFMessageWriter messageWriter = new PDFMessageWriter();
		return messageWriter;

	}

}
