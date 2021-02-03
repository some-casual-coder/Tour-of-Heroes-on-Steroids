package com.nathan.heroesOnSteroids.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathan.heroesOnSteroids.entities.Hero;
import com.nathan.heroesOnSteroids.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String userName);

	List<Hero> findAllUserHeroes();
}
