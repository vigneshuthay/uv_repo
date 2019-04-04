package com.PlayerApp.springboot.TestRest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestRest {
	
	public static void main(String[] args) {
		
		//String url = "http://localhost:1794/MicroService1/controller/getDetailsUsingPlayerId/1";
		String url = "http://localhost:1794/controller/getAllPlayers";
		
		RestTemplate restTemplate = new RestTemplate();
		
		//ResponseEntity<List> response = restTemplate.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List>(){});
	
		//Above code will also work
		
		ResponseEntity<Object[]> response = restTemplate.getForEntity(url,Object[].class);
		
		List playerList = Arrays.asList(response.getBody());
		
		System.out.println("playerList : "+playerList);
		
		//System.out.println(player.getId()+" "+player.getPlayerId()+" "+player.getPlayerName()+" "+player.getPlayerMatches());
		
	}

}
