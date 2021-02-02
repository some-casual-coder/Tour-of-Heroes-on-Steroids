package com.nathan.heroesOnSteroids.services;

public interface ImageModelService {

	byte[] compressBytes(byte[] data);

	byte[] unCompressBytes(byte[] data);

}
