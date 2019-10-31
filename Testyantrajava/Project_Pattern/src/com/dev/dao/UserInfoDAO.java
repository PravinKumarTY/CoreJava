package com.dev.dao;

import java.util.List;

import com.dev.beans.User;

public interface UserInfoDAO {
	public List<User> getAllInfo();
	public void createProfile(User user);
}
