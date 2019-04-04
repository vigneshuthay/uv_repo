package com.example.REST;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface PlayerService {
	public int create(Player user);
	public Player findUserById(int playerId);
}

