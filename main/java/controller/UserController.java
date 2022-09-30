package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaPractice.Entity.User;
import com.JavaPractice.TodoService.UserService;

@RestController
	
	public class UserController {

	    @Autowired
	    private UserService userService;

	    @GetMapping("/login")
	    private User getCurrentUser(@RequestBody User user) {
	        System.out.println("GET User by username and password *****");
	        return userService.getUser(user);
	    }

	    
	    @PostMapping("/createUser")
	    private boolean addUser(@RequestBody User user) {
	        boolean user_exits = userService.findUserByUsername(user.getUsername());
	        if(user_exits) {
	            System.out.println("CANT CREATE USER!");
	            return false;
	        }
	        userService.saveUser(user);
	        return true;
	    }
}



