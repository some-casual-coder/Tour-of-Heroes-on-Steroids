package com.nathan.heroesOnSteroids.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class ImageModel extends AbstractEntity {

	private String name;
	private byte[] imgData;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImgData() {
		return imgData;
	}

	public void setImgData(byte[] imgData) {
		this.imgData = imgData;
	}

}
