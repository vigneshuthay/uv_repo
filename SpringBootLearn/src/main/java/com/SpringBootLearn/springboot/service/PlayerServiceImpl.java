package com.SpringBootLearn.springboot.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.SpringBootLearn.springboot.model.Player;

@Repository
public class PlayerServiceImpl implements PlayerService, InitializingBean , DisposableBean {

	private final String INSERT_SQL = "INSERT INTO PLAYER_TBL (ID, PLAYER_ID, PLAYER_NAME, PLAYER_MATCHES) values(?,?,?,?)";
	private final String SELECT_SQL = "SELECT ID , PLAYER_ID, PLAYER_NAME, PLAYER_MATCHES FROM PLAYER_TBL WHERE PLAYER_ID = ?";
	private final String SELECT_LIST_SQL = "SELECT ID , PLAYER_ID, PLAYER_NAME, PLAYER_MATCHES FROM PLAYER_TBL WHERE PLAYER_ID IS NOT NULL";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(final Player user) {
		System.out.println("Valuesssss : "+user.getId()+","+user.getPlayerId()+","+
				user.getPlayerName()+","+user.getPlayerMatches());
		int errCode = jdbcTemplate.update(INSERT_SQL, new Object[]{user.getId(),user.getPlayerId(),
				user.getPlayerName(),user.getPlayerMatches()});
		return errCode;
	}

	@Override
	public Player findUserById(final int playerId) {
		Player player = (Player)jdbcTemplate.queryForObject(SELECT_SQL, new Object[] {playerId} , new UserMapper());
		return player;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Destroy ...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet ...");
	}

	@Override
	public List<Player> getPlayersCollection() {
		System.out.println("Inside getPlayersCollection .......");
		 List<Player> list = (List)jdbcTemplate.queryForList(SELECT_LIST_SQL);
		 return list;
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

