package com.MicroService1.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MicroService1.springboot.model.Player;

@Service
public interface PlayerService {
	
	Player getDetailsUsingPlayerId(int playerId);
	List<Object> getAllPlayers();

}
