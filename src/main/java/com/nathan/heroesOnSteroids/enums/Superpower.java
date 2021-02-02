package com.nathan.heroesOnSteroids.enums;

import java.util.Random;

public enum Superpower {
	
	SUPER_SPEED("super-speed", 1, 50),
	TELEPATHY("super-speed", 1, 50),
	TELEKINESIS("super-speed", 1, 50),
	TIME_BENDING("super-speed", 1, 50),
	REGENERATION("super-speed", 1, 50),
	INVULNERABILITY("super-speed", 1, 50),
	SUPER_INTELLIGENCE("super-speed", 1, 50),
	PRECOGNITION("super-speed", 1, 50),
	ILLUSION("super-speed", 1, 50),
	SUPER_STRENGTH("super-strength", 2, 50),
	SHAPE_SHIFTING("super-strength", 2, 50),
	LASER_VISION("super-strength", 2, 50),
	INVISIBILTY("super-strength", 2, 50),
	MAGIC("super-strength", 2, 50),
	ATOMIC_MANIPULATION("super-strength", 2, 50),
	ANIMAL_CONTROL("super-strength", 2, 50),
	FLIGHT("super-strength", 3, 50),
	PHASING("super-strength", 3, 50),
	CLAWS("super-strength", 3, 50),
	MARTIAL_ARTS("super-strength", 3, 50),
	STRETCHING("super-strength", 3, 50),
	FEAR_MANIPULATION("super-strength", 3, 50);
	
	public final String skill;
	public final int rank;
	public final int power;
	
	private Superpower(String skill, int rank, int power) {
		Random random = new Random();
		int max = 101;
		this.skill = skill;
		this.rank = rank;
		this.power = random.nextInt(max-power) + power;
	}
	
}
