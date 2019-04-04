package com.MicroService2.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MicroService2.springboot.model.Player;

@Service
public interface PlayerService {
	
	Player getPlayerInfo(String playerName);

}
