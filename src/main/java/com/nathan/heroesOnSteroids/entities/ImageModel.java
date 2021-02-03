package com.nathan.heroesOnSteroids.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class ImageModel extends AbstractEntity {

	private String name;
	private String type;
	// @Lob
	private byte[] imgData;

	@OneToOne(mappedBy = "imageModel")
	private Hero hero;

	public ImageModel() {
		super();
	}

	public ImageModel(String name, String type, byte[] imgData) {
		this.name = name;
		this.type = type;
		this.imgData = imgData;
	}

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

}
