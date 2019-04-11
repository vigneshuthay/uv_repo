package com.MicroService1.springboot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.MicroService1.springboot.model.Player;
import com.MicroService1.springboot.service.PlayerService;

@Repository
public class PlayerDao implements PlayerService{

	private final String SELECT_USING_PLAYER_ID = "SELECT ID , PLAYER_ID, PLAYER_NAME, PLAYER_MATCHES FROM PLAYER_TBL WHERE PLAYER_ID = ?";
	private final String SELECT_ALL_PLAYERS = "SELECT ID , PLAYER_ID, PLAYER_NAME, PLAYER_MATCHES FROM PLAYER_TBL";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Player getDetailsUsingPlayerId(final int playerId) {
		Player player = (Player)jdbcTemplate.queryForObject(SELECT_USING_PLAYER_ID, new Object[] {playerId} , new UserMapper());
		return player;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Object> getAllPlayers() {
		@SuppressWarnings("unchecked")
		/*List<Player> playerList  = jdbcTemplate.query(SELECT_ALL_PLAYERS,new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4);
			}
		});*/
		List<Object> playerList  = (List<Object>)jdbcTemplate.query(SELECT_ALL_PLAYERS,new UserMapper());
		System.out.println("Inside getAllPlayers .......... "+playerList);
		return playerList;
	}

}

class UserMapper implements RowMapper<Object> {

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		Player user = new Player();
		user.setId(rs.getInt("ID"));
		user.setPlayerId(rs.getInt("PLAYER_ID"));
		user.setPlayerName(rs.getString("PLAYER_NAME"));
		user.setPlayerMatches(rs.getString("PLAYER_MATCHES"));
		return user;
	}

}

