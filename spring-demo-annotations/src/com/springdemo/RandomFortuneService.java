package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array
	String[] data = { 
	"Divine is wisdom", 
	"Beware of fake friends",
	"be open for the change"
	};
	
	// generate random

	private Random myRandom = new Random();


	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
