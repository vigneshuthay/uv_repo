package com.SpringBootLearn.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootLearn.springboot.model.Player;

@Service
public interface PlayerService {
	public int create(Player user);
	public Player findUserById(int playerId);
	public List<Player> getPlayersCollection();
}

