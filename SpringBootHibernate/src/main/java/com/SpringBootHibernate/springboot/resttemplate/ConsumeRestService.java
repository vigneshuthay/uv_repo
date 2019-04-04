package com.SpringBootHibernate.springboot.resttemplate;

import org.springframework.web.client.RestTemplate;

import com.SpringBootHibernate.springboot.model.Player;

public class ConsumeRestService {
	
	public static void main(String[] args) {
		
		final String uri = "http://localhost:5050/players";
	     
		RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    
	    System.out.println("Result ::::: "+result);
	    
	   // System.out.println(user.getId()+","+user.getPlayerId()+","+user.getPlayerName()+","+user.getPlayerMatches());
		
	}

}

