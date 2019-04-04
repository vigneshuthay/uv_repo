package com.MicroService2.springboot.model;

import java.io.Serializable;

public class Player implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String playerName;
	private String playerCity;
	private String playerCountry;
	
	public Player() {
		//Default
	}

	public Player(String playerName,String playerCity,String playerCountry) {
		super();
		this.playerName = playerName;
		this.playerCity = playerCity;
		this.playerCountry = playerCountry;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerCity() {
		return playerCity;
	}

	public void setPlayerCity(String playerCity) {
		this.playerCity = playerCity;
	}

	public String getPlayerCountry() {
		return playerCountry;
	}

	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}
	
}

