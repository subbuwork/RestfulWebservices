package com.java.restapi.service;

import java.util.ArrayList;
import java.util.List;

import com.java.restapi.dao.UserDao;
import com.java.restapi.dao.UserDaoImpl;
import com.java.restapi.pojo.User;

public class UserServiceImpl implements UserService {
    List<User> usersList = null;
    UserDao userDao = new UserDaoImpl();
	@Override
	public List<User> getAllUsers() {
		System.out.println("Entering UserServiceImpl  getAllUsers()");
		usersList = new ArrayList<User>();
		
		usersList = userDao.getAllUsers();
		
		System.out.println("Exiting UserServiceImpl  getAllUsers()::userList size:"+usersList.size());
		return usersList;
	}

}
