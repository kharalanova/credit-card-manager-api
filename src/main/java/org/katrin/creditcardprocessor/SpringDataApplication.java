package org.katrin.creditcardprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringDataApplication {

	@Autowired
	CreditCardRepository ccr;

	@PostConstruct
	public void init() {
		//prepopulate with some data
		CreditCard cc  = new CreditCard("Neil Lars", "1234567897", 100);
		ccr.save(cc);
		cc  = new CreditCard("Peter Johnes", "1234567897", 100);
		ccr.save(cc);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

}

