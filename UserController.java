package com.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.crud.models.User;
import com.crud.services.UserService;
import com.crud.services.UserServiceImpl;



@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;

	@GetMapping("/")
	public String register(Model model)
	{
	    User user=new User();
	    model.addAttribute("user" ,user);
	    return "register";
	}
	

	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user)
	{    
		String result="error" ;
		System.out.println(user);
		
		if(user.getPassword().equals(user.getConfpassword()))
		{
//			userServiceImpl.registerUser(user);
			try {
			userServiceImpl.registerUser(user);
			result="home";	
		     }
		catch(Exception e)
		{
			result="error";

		}
	
	}
		return result;
	
	}	
	
}
