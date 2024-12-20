package com.fintrack.FinTrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintrack.FinTrack.entity.Users;

import com.fintrack.FinTrack.service.UserService;

@RestController
@RequestMapping("/users")
public class UserControllerImpl implements UserController {
	@Autowired
	UserService userService;
	
	@Override
	@GetMapping
	public ResponseEntity<List<Users>> getAll(){
		List<Users> allUsers = userService.findAllUsers();
		return new ResponseEntity<>(allUsers,HttpStatus.OK);
	}

	@Override
	@GetMapping("/{uid}")
	public ResponseEntity<Users> getUserByUid(@PathVariable("uid") String uid) {
		Users user = userService.findUserByUid(uid);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	
}
