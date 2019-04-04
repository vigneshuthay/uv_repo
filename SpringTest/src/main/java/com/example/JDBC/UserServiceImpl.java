package com.example.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserService, InitializingBean , DisposableBean {

	private final String INSERT_SQL = "INSERT INTO PLAYER_TBL (ID, PLAYER_ID, PLAYER_NAME, PLAYER_MATCHES) values(?,?,?,?)";
	private final String SELECT_SQL = "SELECT ID , PLAYER_ID, PLAYER_NAME, PLAYER_MATCHES FROM PLAYER_TBL";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(final User user) {
		int errCode = jdbcTemplate.update(INSERT_SQL, new Object[]{user.getId(),user.getPlayerId(),
				user.getPlayerName(),user.getPlayerMatches()});
		return errCode;
	}

	@Override
	public List findUserById(final int playerId) {
		List<User> strLst = (List)jdbcTemplate.queryForList(SELECT_SQL,new UserMapper());
		return strLst;
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
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("ID"));
		user.setPlayerId(rs.getInt("PLAYER_ID"));
		user.setPlayerName(rs.getString("PLAYER_NAME"));
		user.setPlayerMatches(rs.getString("PLAYER_MATCHES"));
		return user;
	}

}
