package com.nathan.heroesOnSteroids.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathan.heroesOnSteroids.entities.Heroes;

public interface HeroesRepo extends JpaRepository<Heroes, Long> {

}
