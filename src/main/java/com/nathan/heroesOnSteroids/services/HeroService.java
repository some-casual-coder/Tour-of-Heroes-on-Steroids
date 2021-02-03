package com.nathan.heroesOnSteroids.services;

import java.util.List;

import com.nathan.heroesOnSteroids.entities.Hero;

public interface HeroService {

	Hero save(Hero hero);

	Hero update(Hero hero);

	void delete(Long id);

	Hero findById(Long id);

	Hero findByName(String name);

	List<Hero> findAll();

}
