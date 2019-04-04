package com.MicroService2.springboot.TestRest;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.MicroService2.springboot.model.Player;

public class TestRest {
	
	public static void main(String[] args) {
		
		//String url = "http://localhost:1794/MicroService1/controller/getDetailsUsingPlayerId/1";
		String url = "http://localhost:1794/controller/getAllPlayers";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List> response = restTemplate.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List>(){});
	
		List playerList = response.getBody();
		
		System.out.println("playerList : "+playerList);
		
		//System.out.println(player.getId()+" "+player.getPlayerId()+" "+player.getPlayerName()+" "+player.getPlayerMatches());
		
	}

}
