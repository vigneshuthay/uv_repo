package com.MicroService2.springboot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.MicroService2.springboot.model.Player;
import com.MicroService2.springboot.service.PlayerService;

@Repository
public class PlayerDao implements PlayerService{

	private final String SELECT_USING_PLAYER_NAME = "SELECT PLAYER_NAME, PLAYER_CITY, PLAYER_COUNTRY FROM PLAYER_INFO WHERE PLAYER_NAME = ?";
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Player getPlayerInfo(final String playerName) {
		Player player = (Player)jdbcTemplate.queryForObject(SELECT_USING_PLAYER_NAME, new Object[] {playerName} , new UserMapper());
		return player;
	}

}

class UserMapper implements RowMapper<Object> {

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		Player user = new Player();
		user.setPlayerName(rs.getString("PLAYER_NAME"));
		user.setPlayerCity(rs.getString("PLAYER_CITY"));
		user.setPlayerCountry(rs.getString("PLAYER_COUNTRY"));
		return user;
	}

}

