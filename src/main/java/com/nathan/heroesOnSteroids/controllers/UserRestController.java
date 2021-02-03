package com.nathan.heroesOnSteroids.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nathan.heroesOnSteroids.entities.Hero;
import com.nathan.heroesOnSteroids.entities.User;
import com.nathan.heroesOnSteroids.services.UserService;

@RestController
@RequestMapping("/heroUsers")
public class UserRestController {

	@Autowired
	UserService userService;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.save(user);
	}

	@PostMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return userService.update(user);
	}

	@DeleteMapping
	public void deleteUser(@RequestParam Long id) {
		userService.delete(id);
	}

	@GetMapping
	public List<User> findAllUsers() {
		return userService.findAll();
	}

	@GetMapping
	public User findById(@RequestParam Long id) {
		return userService.findById(id);
	}

	@GetMapping
	public User findByUsername(@RequestParam String userName) {
		return userService.findByUsername(userName);
	}

	@GetMapping
	public List<Hero> findAllUserHeroes() {
		return userService.findAllUserHeroes();
	}

}
