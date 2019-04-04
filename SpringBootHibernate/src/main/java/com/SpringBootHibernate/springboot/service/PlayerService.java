package com.SpringBootHibernate.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootHibernate.springboot.model.Player;

@Service
public interface PlayerService {
	public int create(Player user);
	public Player findUserById(int playerId);
	public String getPlayersCollection();
}

