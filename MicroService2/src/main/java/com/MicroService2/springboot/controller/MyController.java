package com.MicroService2.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.MicroService2.springboot.model.Player;
import com.MicroService2.springboot.service.PlayerService;

@RestController
@RequestMapping("/controller")
public class MyController {

	@Autowired
	private PlayerService playerSevice;

	@RequestMapping(value="/getPlayerInfo/{playerName}",method=RequestMethod.GET,produces = "application/json")
	public Player getPlayerInfo(@PathVariable String playerName) {
		System.out.println("Inside getPlayerInfo .......");
		return playerSevice.getPlayerInfo(playerName);
	}
	
}

