package com.MicroService1.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.MicroService1.springboot.model.Player;
import com.MicroService1.springboot.service.PlayerService;

@RestController
@RequestMapping("/controller")
public class MyController {

	@Autowired
	private PlayerService playerSevice;

	@RequestMapping(value="/getDetailsUsingPlayerId/{playerId}",method=RequestMethod.GET,produces = "application/json")
	public Player getDetailsUsingPlayerId(@PathVariable int playerId) {
		return playerSevice.getDetailsUsingPlayerId(playerId);
	}
	
	@RequestMapping(value="/getAllPlayers",method=RequestMethod.GET,produces = "application/json")
	public List<Object> getAllPlayers() {
		return playerSevice.getAllPlayers();
	}
	
	/*@RequestMapping(value="/getAllPlayers",method=RequestMethod.GET,produces = "application/json")
	public ModelAndView getAllPlayers() {
		ModelAndView modelAndView = new ModelAndView("AllPlayers");
	    modelAndView.addObject("AllPlayers",playerSevice.getAllPlayers());
		return modelAndView;
	}*/
	
	@RequestMapping(value="/goToSample",method=RequestMethod.GET)
	public ModelAndView goToSample() {
	    ModelAndView modelAndView = new ModelAndView("Sample");
	    modelAndView.addObject("message", "Vignesh");
	    return modelAndView;
	}

}

