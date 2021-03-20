package com.purchase.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeApplication {
	private static Logger logger = LoggerFactory.getLogger(HomeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HomeApplication.class, args);
		logger.info("... Purchase - Home App Started ..");
	}

}
