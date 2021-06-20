package com.purchase.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(HomeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HomeApplication.class, args);
		System.out.println("--HomeApplication---");
		LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
	}

}
