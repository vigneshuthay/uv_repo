package com.PlayerApp.springboot.model;

import java.io.Serializable;

public class Player1 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int playerId;
	private String playerName;
	private String playerMatches;
	
	public Player1() {
		//Default
	}

	public Player1(int id,int playerId,String playerName,String playerMatches) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerMatches = playerMatches;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerMatches() {
		return playerMatches;
	}
	public void setPlayerMatches(String playerMatches) {
		this.playerMatches = playerMatches;
	}

}
