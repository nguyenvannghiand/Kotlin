package com.example.daggerjava.model;

public class Hotgirl {
	String name;
	String avatar;

	public Hotgirl() {
	}

	public Hotgirl(String name, String avatar) {
		this.name = name;
		this.avatar = avatar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}
