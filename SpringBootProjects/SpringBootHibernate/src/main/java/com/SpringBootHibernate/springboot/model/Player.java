package com.SpringBootHibernate.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Table(name="PLAYER_TBL")
@Entity
@NamedQueries({
	@NamedQuery(name="SELECT_LIST_SQL",query="select playerName from Player where playerId = :playerId")
})
public class Player {

	@Id
    @Column(name = "id")
	private int id;
    @Column(name = "playerId")
	private Integer playerId;
    @Column(name = "playerName")
	private String playerName;
    @Column(name = "playerMatches")
	private String playerMatches;
    
    public Player(int id,Integer playerId,String playerName,String playerMatches) {
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
	
	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
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
