package com.example.JDBC;

public class User {

	private int id;
	private int playerId;
	private String playerName;
	private String playerMatches;

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
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
