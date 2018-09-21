package com.springdemo;

import org.springframework.stereotype.Component;

@Component("sillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice tennis";

	}

}
