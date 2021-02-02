package com.nathan.heroesOnSteroids.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathan.heroesOnSteroids.entities.ImageModel;

public interface ImageModelRepo extends JpaRepository<ImageModel, Long> {
	
	Optional<ImageModel> findByName(String name);

}
