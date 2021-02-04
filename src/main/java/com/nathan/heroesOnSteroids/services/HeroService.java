package com.nathan.heroesOnSteroids.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.nathan.heroesOnSteroids.entities.Hero;

public interface HeroService {

	Hero save(Hero hero);

	Hero update(Hero hero);

	Hero saveFromRawDetails(String name, MultipartFile file, List<String> superpowers, Long user_id) throws IOException;

	void delete(Long id);

	Hero findById(Long id) throws IOException;

	Hero findByName(String name) throws IOException;

	List<Hero> findAll();

}
