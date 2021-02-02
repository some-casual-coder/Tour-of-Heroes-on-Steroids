package com.nathan.heroesOnSteroids.services;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.stereotype.Service;

@Service
public class ImageModelServiceImpl implements ImageModelService {

	// Compress the image
	@Override
	public byte[] compressBytes(byte[] input) {
		Deflater deflater = new Deflater();
		deflater.setInput(input);
		deflater.finish();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(input.length);
		byte[] buffer = new byte[1024];
		while (!deflater.finished()) {
			int count = deflater.deflate(buffer);
			outputStream.write(buffer, 0, count);
		}
		try {
			outputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
		System.out.println("Compressed Image byte size: " + outputStream.toByteArray().length);
		return outputStream.toByteArray();
	}

	// Uncompress the image
	@Override
	public byte[] unCompressBytes(byte[] input) {
		Inflater inflater = new Inflater();
		inflater.setInput(input);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(input.length);
		byte[] buffer = new byte[1024];
		try {
			while (!inflater.finished()) {
				int count = inflater.inflate(buffer);
				outputStream.write(buffer, 0, count);
			}
			outputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
		} catch (DataFormatException e) {
			// TODO: handle exception
		}
		return outputStream.toByteArray();
	}

}
