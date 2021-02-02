package com.nathan.heroesOnSteroids.entities;

import java.util.EnumSet;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.nathan.heroesOnSteroids.enums.Superpower;

@Entity
@Table(name = "heroes")
public class Heroes extends AbstractEntity {

	private String name;
	private ImageModel imageModel;
	private EnumSet<Superpower> superpowers = EnumSet.noneOf(Superpower.class);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ImageModel getImageModel() {
		return imageModel;
	}

	public void setImageModel(ImageModel imageModel) {
		this.imageModel = imageModel;
	}

	public EnumSet<Superpower> getSuperpowers() {
		return superpowers;
	}

	public void setSuperpowers(EnumSet<Superpower> superpowers) {
		this.superpowers = superpowers;
	}

}
