package com.nathan.heroesOnSteroids;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TourOfHeroesOnSteroidsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourOfHeroesOnSteroidsApplication.class, args);
	}

}
