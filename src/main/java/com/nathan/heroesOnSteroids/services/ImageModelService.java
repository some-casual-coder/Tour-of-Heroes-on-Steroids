package com.nathan.heroesOnSteroids.services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.nathan.heroesOnSteroids.entities.ImageModel;

public interface ImageModelService {

	byte[] compressBytes(byte[] data);

	byte[] unCompressBytes(byte[] data);

	ImageModel uploadImage(MultipartFile file, Long id) throws IOException;
	
	ImageModel processImage(String name) throws IOException;

}
