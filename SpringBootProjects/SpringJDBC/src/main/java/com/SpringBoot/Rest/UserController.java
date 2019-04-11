package com.SpringBoot.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  

@RestController  
@RequestMapping("/controller")
public class UserController{
	@Autowired  
	JdbcTemplate jdbc;    
	@GetMapping("/SelectCard")
	public String index(){  
		String cardNum = jdbc.queryForObject("SELECT CARD_NUM FROM CDMST WHERE ROWNUM = 1",String.class);
		return cardNum;
	}  
}

