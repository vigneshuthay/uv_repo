package com.example.JDBC;

import java.util.List;

public interface UserService {
	public int create(User user);
	public List findUserById(int playerId);
}

