package com.java.restapi.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.java.restapi.constants.UserConstants;
import com.java.restapi.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> getAllUsers() {
		System.out.println("Entering UserDaoImpl  getAllUsers()");
		InitialContext context = null;
		DataSource dataSource = null;
		Connection connection = null;
		List<User> usersList = new ArrayList<User>();
		User user = null;
		try {
			context = new InitialContext();
			dataSource = (DataSource)context.lookup("jndi/mysql");
			connection = dataSource.getConnection();
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(UserConstants.GET_ALL_USER);
			
			while(resultSet.next()){
				user = new User();
				user.setId(resultSet.getInt(1));
				user.setfName(resultSet.getString(2));
				user.setlName(resultSet.getString(3));
				user.setAddressLine1(resultSet.getString(4));
				user.setAddressLine2(resultSet.getString(5));
				user.setProfession(resultSet.getString(6));
				user.setDob(resultSet.getDate(7).toString());
				user.setDoj(resultSet.getDate(8).toString());
				user.setSalary(resultSet.getLong(9));
				
				System.out.println("UserDetails:::"+"User id::"
				                   +user.getId()+"::user fname::"
						           +user.getfName()+"::User lName::"
						           +user.getlName()+"::User address1::"
								   +user.getAddressLine1()+"::User address2::"
								   +user.getAddressLine2()+"::user profession::"
								   +user.getProfession()+"::User DOB::"
								   +user.getDob()+"::User DOJ::"
								   +user.getDoj()+"::User salary::"
								   +user.getSalary());
				
				usersList.add(user);
			}
			
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(connection!=null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("exiting UserDaoImpl  getAllUsers():::usersList size::"+usersList.size());
		return usersList;
	}

}
