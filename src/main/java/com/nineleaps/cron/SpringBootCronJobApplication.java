package com.nineleaps.cron;

import com.nineleaps.cron.configurations.MainConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class SpringBootCronJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCronJobApplication.class, args);
	}

}
