package com.example.REST;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerServiceImpl implements PlayerService, InitializingBean , DisposableBean {

	private final String INSERT_SQL = "INSERT INTO PLAYER_TBL (ID, PLAYER_ID, PLAYER_NAME, PLAYER_MATCHES) values(?,?,?,?)";
	private final String SELECT_SQL = "SELECT ID , PLAYER_ID, PLAYER_NAME, PLAYER_MATCHES FROM PLAYER_TBL WHERE PLAYER_ID = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(final Player user) {
		int errCode = jdbcTemplate.update(INSERT_SQL, new Object[]{user.getId(),user.getPlayerId(),
				user.getPlayerName(),user.getPlayerMatches()});
		return errCode;
	}

	@Override
	public Player findUserById(final int playerId) {
		Player player = (Player)jdbcTemplate.queryForList(SELECT_SQL,playerId,new UserMapper());
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
}

class UserMapper implements RowMapper {

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
