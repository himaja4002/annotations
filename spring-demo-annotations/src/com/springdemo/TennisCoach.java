package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired	
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("inside Tennis coach constructor");
	}
	
	/*// method injection
	@Autowired
	public void doSomeCrazy(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		System.out.println("inside dosome crazy method");
	}
	*/
	/*// define setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		System.out.println("inside setter method");
	}*/
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/

	// define init and destroy method
	@PostConstruct 
	public void doMyStartup() {
		System.out.println("Inside domystart - postconstruct");
	}
	
	@PreDestroy
	public void doMyCleanup()
	{
		System.out.println("domycleanup-destroy");
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice tennis";

	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
