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
	@Qualifier("friendship")
	@Autowired(required=false)
	public void setQuotes(Quotes quotes) {
		System.out.println("set course");
		Quotes = quotes;
	}

	@PostConstruct
	public void init() {
	System.out.println("PostConstruct");
//	System.out.println(friendship);
//	System.out.println(hardwork);
	}
	
	@PreDestroy
	public void beforeDestory() {
	System.out.println("PreDestory");
	}

	@Override
	public void run(String... args) {
		for (var Course : Quotes.getCourse())
			System.out.println(Course);

	}
}
