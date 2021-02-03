package com.nathan.heroesOnSteroids.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathan.heroesOnSteroids.entities.Hero;
import com.nathan.heroesOnSteroids.repos.HeroRepo;

@Service
public class HeroServiceImpl implements HeroService {

	@Autowired
	HeroRepo heroRepo;

	@Override
	public Hero save(Hero hero) {
		return heroRepo.save(hero);
	}

	@Override
	public Hero update(Hero hero) {
		return heroRepo.save(hero);
	}

	@Override
	public void delete(Long id) {
		heroRepo.deleteById(id);
	}

	@Override
	public Hero findById(Long id) {
		return heroRepo.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
	}

	@Override
	public Hero findByName(String name) {
		return heroRepo.findByName(name);
	}

	@Override
	public List<Hero> findAll() {
		return heroRepo.findAll();
	}

}
