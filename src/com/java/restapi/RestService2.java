package com.java.restapi;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.java.restapi.pojo.User;
import com.java.restapi.service.UserService;
import com.java.restapi.service.UserServiceImpl;

@Path("RestService2")
public class RestService2 {

	@GET
	@Path("/getMessage")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		
		String message = "RestAPI2.x version.....@@@@@@@@@@@@@@@@@@@@@";
		
		return message;
	}
	
	@GET
	@Path("/getAllUsers")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getAllUsers(){
		System.out.println("Entering RestService2  getAllUsers()");
		UserService userService = new UserServiceImpl();
		List<User> usersList = new ArrayList<User>();
		usersList = userService.getAllUsers();
		GenericEntity<List<User>> genericEntity = new GenericEntity<List<User>>(usersList){};
		System.out.println("Exiting RestService2  getAllUsers():::List size::"+usersList.size());
		return Response.ok().entity(genericEntity).build();
	}
	
}
