package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Message;
import com.example.model.User;

@Controller("SessionController")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:4444"}, allowCredentials = "true")
/*
 * If you don't add "http://" at the start of your request URIs in Angular, then you can STILL get CORS issues
 * 
 * If your clientside is sending credentials to authenticate, then you server needs to explicitly say 
 * 	"yes, I am expecting the client to send me credentials"
 */
public class SessionController {

	//http://localhost:9090/login
	@GetMapping(value = "login", produces = "application/json")
	public @ResponseBody Message login(HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		
		User incomingUser = new User("Bobby", true);
		
		session.setAttribute("loggedInUser", incomingUser);
		
		return new Message("You've succesfully logged in");
	}
	
	//http://localhost:9090/getCurrentInfo
	@GetMapping(value = "logout", produces = "application/json")
	public @ResponseBody Message logout(HttpSession session) {
		
		session.invalidate();

		return new Message("You've succesfully logged out");
	}
	
	//http://localhost:9090/logout
	@GetMapping(value = "getCurrentInfo")
	public @ResponseBody User getLoggedInUser(HttpSession session){
		
		User currentUser;
		
		currentUser = (User) session.getAttribute("loggedInUser");
		
		if(currentUser == null) {
			currentUser = new User("invalid user",false);
		}
		
		return currentUser;
		
	}
}
