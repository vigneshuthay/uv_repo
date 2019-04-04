package com.SpringBootLearn.springboot.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="player")
@XmlAccessorType(XmlAccessType.NONE)
public class Player {

    @XmlElement(name = "id")
	private int id;
    @XmlElement(name = "playerId")
	private int playerId;
    @XmlElement(name = "playerName")
	private String playerName;
    @XmlElement(name = "playerMatches")
	private String playerMatches;
    
    public Player(int id,int playerId,String playerName,String playerMatches) {
    	super();
    	this.id = id;
    	this.playerId = playerId;
    	this.playerName = playerName;
    	this.playerMatches = playerMatches;
    }
    
    public Player(){
    	//Nothing
    }

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
	
	@Override
	public String toString() {
		return "{\"playerId\":\""+playerId+"\",playerName\":\""+playerName+"\",\"playerMatches\":\""+playerMatches+"\"}";
	}

}
