package com.PlayerApp.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.PlayerApp.springboot.model.Player;

@Service
public interface PlayerService {
	
	List<Object> getAllPlayers();
	Player getPlayerInfo(String playerName);

}
