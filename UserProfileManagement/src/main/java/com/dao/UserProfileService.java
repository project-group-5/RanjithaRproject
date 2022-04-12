package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.model.UserProfileDetails;

@Service
public class UserProfileService {
	
	@Autowired
	UserDAO userDAOImpl;

	public void add(UserProfileDetails profile) {
		userDAOImpl.addProfile(profile);
		
	}
	public UserProfileDetails find(int id) {
		return userDAOImpl.findProfile(id);
	}
	public List<UserProfileDetails> findAll(){
		return userDAOImpl.findAllProfile();
	}
	public boolean update(UserProfileDetails profile) {
		return userDAOImpl.updateProfile(profile);
	}
	public boolean delete(UserProfileDetails profile) {
		return userDAOImpl.deleteProfile(profile);
	}
}
