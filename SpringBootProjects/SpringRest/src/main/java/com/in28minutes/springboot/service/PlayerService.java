package com.in28minutes.springboot.service;

import org.springframework.stereotype.Service;

import com.in28minutes.springboot.model.Player;

@Service
public interface PlayerService {
	public int create(Player user);
	public Player findUserById(int playerId);
}

