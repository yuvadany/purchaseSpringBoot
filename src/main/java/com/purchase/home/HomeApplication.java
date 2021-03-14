package com.purchase.home;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeApplication {
	static Logger logger = org.slf4j.LoggerFactory.getLogger(HomeApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(HomeApplication.class, args);
		logger.info("Purchase Home App Started....");
	}

}
