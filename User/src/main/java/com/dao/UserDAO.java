package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserDAO {
	
	public void addUser(User user);
	public User findUser(int id);
	public List<User> findAllUser();
	public boolean updateUser(User user);
	public boolean deleteUser(int id);

}
