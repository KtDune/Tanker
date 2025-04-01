package com.tanker.tanker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanker.tanker.entities.UserAccount;
import com.tanker.tanker.interfaces.UserInterfaces;

@RestController
@RequestMapping("/api/v1/user")
public class UserAccountController {
	
	@Autowired
	private UserInterfaces usrint;
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/getUserAccount")
	public String getUserAccount() {
		return "Success";
	}
	
	@PostMapping("/createUserAccount")
	public String addUserAccount(@RequestBody UserAccount usracc) {
		usracc.setPassword(passwordEncoder.encode(usracc.getPassword()));
		usrint.save(usracc);
		
		return "Success!";
	}

}
