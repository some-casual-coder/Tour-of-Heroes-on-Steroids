package com.nathan.heroesOnSteroids.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nathan.heroesOnSteroids.entities.Hero;
import com.nathan.heroesOnSteroids.services.HeroService;

@RestController
@RequestMapping("/tourOfHeroes")
public class HeroRestController {

	@Autowired
	HeroService heroService;

	@PostMapping
	public Hero saveHeroFromRawdetails(@RequestParam String name, @RequestParam MultipartFile file,
			@RequestParam List<String> superpowers, @RequestParam Long user_id) throws IOException {
		Hero hero = heroService.saveFromRawDetails(name, file, superpowers, user_id);
		return hero;
	}

	@PostMapping
	public Hero updateHero(@RequestBody Hero hero) {
		return heroService.update(hero);
	}

	@DeleteMapping
	public void deleteHero(@RequestParam Long id) {
		heroService.delete(id);
	}

	@GetMapping
	public Hero findById(@RequestParam Long id) {
		return heroService.findById(id);
	}

	@GetMapping
	public Hero findByName(@RequestParam String name) {
		return heroService.findByName(name);
	}

	@GetMapping
	public List<Hero> findAllHeroes() {
		return heroService.findAll();
	}

}
