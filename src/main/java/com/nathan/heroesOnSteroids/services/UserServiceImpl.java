package com.nathan.heroesOnSteroids.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathan.heroesOnSteroids.entities.Hero;
import com.nathan.heroesOnSteroids.entities.User;
import com.nathan.heroesOnSteroids.repos.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public User save(User user) {
		return userRepo.save(user);
	}

	@Override
	public User update(User user) {
		return userRepo.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepo.deleteById(id);
	}

	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public User findById(Long id) {
		return userRepo.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
	}

	@Override
	public User findByUsername(String userName) {
		return userRepo.findByUsername(userName);
	}

	@Override
	public List<Hero> findAllUserHeroes() {
		return userRepo.findAllUserHeroes();
	}

}
