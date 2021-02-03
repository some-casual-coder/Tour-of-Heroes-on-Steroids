package com.nathan.heroesOnSteroids.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathan.heroesOnSteroids.entities.Hero;

@Repository
public interface HeroRepo extends JpaRepository<Hero, Long> {

	Hero findByName(String name);

}
