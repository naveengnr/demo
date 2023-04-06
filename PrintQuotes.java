package com.img2.Assaignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

class PrintQuotes implements CommandLineRunner {
	
//  @Qualifier("friendship")	
//	@Autowired
	Quotes Quotes;
//	@Autowired
//	Quotes friendship;
//	
//	@Autowired
//	Quotes hardwork;

//	public PrintQuotes(com.img2.Assaignment1.Quotes quotes) {
//		super();
//		Quotes = quotes;
//	}
	
