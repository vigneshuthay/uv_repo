package com.example.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cricket")
public class MyRestController {

	@Autowired
	PlayerService playerSevice;

	@RequestMapping(value="/getPlayerUsingPlayerId/{playerId}",method=RequestMethod.GET)
	public Player getPlayerUsingPlayerId(@PathVariable int playerId) {
		Player player = playerSevice.findUserById(playerId);
		System.out.println("player : "+player);
		return player;
	}

	@RequestMapping(value="/getiplteam/{iplcode}", method=RequestMethod.GET)
	public String getIPLTeam(@PathVariable String iplcode) {

		if(null != iplcode && !"".equalsIgnoreCase(iplcode)){

			if("MI".equalsIgnoreCase(iplcode)){
				return "Mumbai Indians";
			}
			else if("DD".equalsIgnoreCase(iplcode)){
				return "Delhi Daredevils";
			}
			else{
				return "Chennai Super Kings";
			}
		}
		else{
			return "Enter correct IPL team code";
		}
	}

}
