package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.springdemo")
@PropertySource("sports.properties")
public class SportConfig {

	// define bean for sad fortune
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define for swimcoach and DI
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
}
