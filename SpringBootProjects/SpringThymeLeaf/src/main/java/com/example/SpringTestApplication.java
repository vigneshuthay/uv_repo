package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JDBC.User;
import com.example.JDBC.UserService;

@SpringBootApplication
public class SpringTestApplication implements CommandLineRunner{

	private static final String ArrayList = null;
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
		System.out.println("Spring Boot Started .......");
	}

	@Override
	public void run(String...args) {
		//JDBC Template
		//jdbcTest();
	}

	private User getUser() {
		User user = new User(); 
		user.setId(1);
		user.setPlayerId(1);
		user.setPlayerName("Yuvraj"); 
		user.setPlayerMatches("270"); 
		return user; 
	}

	public void jdbcTest(){
		/*
		 * int errCode = userService.create(getUser());
		 * System.out.println("Created User .......... errCode : "+errCode);
		 */ 
		List<User> list = (List)userService.findUserById(1);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			User user = (User)itr.next();
			System.out.println("Find User .......... "+user.getId()+","+user.getPlayerId()+","+user.getPlayerName()+","+user.getPlayerMatches()); 
		}
	}
}

