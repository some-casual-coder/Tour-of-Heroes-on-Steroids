package com.nathan.heroesOnSteroids.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nathan.heroesOnSteroids.entities.Hero;
import com.nathan.heroesOnSteroids.entities.ImageModel;
import com.nathan.heroesOnSteroids.entities.User;
import com.nathan.heroesOnSteroids.enums.Superpower;
import com.nathan.heroesOnSteroids.repos.HeroRepo;

@Service
public class HeroServiceImpl implements HeroService {

	@Autowired
	HeroRepo heroRepo;

	@Autowired
	ImageModelService imageModelService;

	@Autowired
	UserService userService;

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

	@Override
	@Async
	public Hero saveFromRawDetails(String name, MultipartFile file, List<String> superpowers, Long user_id)
			throws IOException {
		Hero hero = new Hero();
		ImageModel img = imageModelService.uploadImage(file, user_id);
		hero.setName(name);
		hero.setImageModel(img);
		User user = userService.findById(user_id);
		hero.setUser(user);
		Collection<Superpower> collectionToCopy = new ArrayList<Superpower>();
		superpowers.forEach((String superpower) -> {
			String newName = superpower.trim().replaceAll("-", "_").toUpperCase();
			collectionToCopy.add(Superpower.valueOf(newName));
		});
		EnumSet<Superpower> superPowersSet = EnumSet.copyOf(collectionToCopy);
		hero.setSuperpowers(superPowersSet);
		Hero savedHero = heroRepo.save(hero);
		return savedHero;
	}

}
//
//import java.util.*;
//
//enum SomeRand{
//SUPER_STRENGTH("strength", 11),
//SUPER_SPEED("super", 13),
//TELEPATHY("telepathy", 34),
//MAGIC("magic", 56),
//VISION("vision", 98);
//
//public final String power;
//public final int numbers;
//
//private SomeRand(String power, int numbers){
//this.power = power;
//this.numbers = numbers;
//}
//}
//
//public class Main {
//  public static void main(String[] args) {
//  	//String text = "super-strength";
//    //String newOne = text.trim().replace("-", "_").toUpperCase();
//    //System.out.println(newOne);
//    List<String> items = new ArrayList<>();
//
//        items.add("super-strength");
//        items.add("super-speed");
//        items.add("telepathy");
//        items.add("magic");
//     
//     Collection<SomeRand> sample = new ArrayList<SomeRand>();
//
//        items.forEach((String name) -> {
//            String newOne = name.trim().replaceAll("-","_").toUpperCase();
//            sample.add(SomeRand.valueOf(newOne));
//        });
//        
//     EnumSet<SomeRand> someName = EnumSet.copyOf(sample);
//     System.out.println("ye" + someName);
//     
//     
//  }
//}
