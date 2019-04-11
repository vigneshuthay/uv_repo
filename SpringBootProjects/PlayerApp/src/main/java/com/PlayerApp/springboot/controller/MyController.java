package com.PlayerApp.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.PlayerApp.springboot.service.PlayerService;

@RestController
@RequestMapping("/controller")
public class MyController {

	@Autowired
	private PlayerService playerSevice;

	@RequestMapping(value="/getAllPlayers",method=RequestMethod.GET,produces = "application/json")
	@CrossOrigin
	public ModelAndView getAllPlayers() {
		ModelAndView modelAndView = new ModelAndView("AllPlayers");
	    modelAndView.addObject("AllPlayers",playerSevice.getAllPlayers());
		return modelAndView;
	}
	
	@RequestMapping(value="/getPlayerInfo/{playerName}",method=RequestMethod.GET,produces = "application/json")
	public ModelAndView getPlayerInfo(@PathVariable String playerName) {
		ModelAndView modelAndView = new ModelAndView("PlayerInfo");
	    modelAndView.addObject("PlayerInfo",playerSevice.getPlayerInfo(playerName));
		return modelAndView;
	}
	
	@RequestMapping(value="/homePage",method=RequestMethod.GET)
	public ModelAndView goToHome() {
		ModelAndView modelAndView = new ModelAndView("HomePage");
	    return modelAndView;
	}

}

