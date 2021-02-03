package com.nathan.heroesOnSteroids.entities;

import java.util.EnumSet;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.nathan.heroesOnSteroids.enums.Superpower;

@Entity
@Table(name = "heroes")
public class Hero extends AbstractEntity {

	private String name;
	private ImageModel imageModel;
	private EnumSet<Superpower> superpowers = EnumSet.noneOf(Superpower.class);
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
