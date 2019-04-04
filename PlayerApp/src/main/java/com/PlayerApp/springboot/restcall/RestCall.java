package com.PlayerApp.springboot.restcall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import com.PlayerApp.springboot.model.Player;
import com.PlayerApp.springboot.model.Player1;
import com.PlayerApp.springboot.service.PlayerService;

@Repository
@EnableDiscoveryClient
public class RestCall implements PlayerService{

	@Autowired
	JdbcTemplate jdbcTemplate;

	//private LoadBalancerClient loadBalancer;

	/*
	@Bean
	@LoadBalanced
	private static RestTemplate restTemplate() {
		return new RestTemplate();
	}
	 */

	@Autowired
	private RestTemplate restTemplate;

	//@Autowired
	//private EurekaClient eurekaClient;

	@Override
	@CrossOrigin
	public List<Object> getAllPlayers() {
		String url = "http://MICROSERVICE1/controller/getAllPlayers";
		//ServiceInstance instance = loadBalancer.choose(url);
		//URI uri = instance.getUri();
		/*
		 * System.out.println("Inside getAllPlayers .........."); Application
		 * application = eurekaClient.getApplication("microservice1");
		 * System.out.println("After application .........."); InstanceInfo instanceInfo
		 * = application.getInstances().get(0);
		 * System.out.println("After instanceInfo .........."); String url = "http://" +
		 * instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() +
		 * "/controller/getAllPlayers"; System.out.println("url : "+url);
		 */
		//ResponseEntity<Object[]> response = restTemplate.getForEntity(url,Object[].class);
		ResponseEntity<List<Player1>> response = restTemplate.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<Player1>>(){});
		System.out.println("After response ....... "+response);
		List<Object> playerList = (List)response.getBody();
		System.out.println("Player List ::: "+playerList);
		return playerList;
	}

	@Override
	public Player getPlayerInfo(String playerName) {
		String url = "http://MicroService2/controller/getPlayerInfo/"+playerName;
		Player player = restTemplate.getForObject(url, Player.class);
		System.out.println("Player player ::: "+player);
		return player;
	}

}
