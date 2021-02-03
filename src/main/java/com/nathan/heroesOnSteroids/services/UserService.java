package com.nathan.heroesOnSteroids.services;

import java.util.List;

import com.nathan.heroesOnSteroids.entities.Hero;
import com.nathan.heroesOnSteroids.entities.User;

public interface UserService {

	User save(User user);

	User update(User user);

	void delete(Long id);

	List<User> findAll();

	User findById(Long id);

	User findByUsername(String userName);

	List<Hero> findAllUserHeroes();

}
