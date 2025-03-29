package com.tanker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tanker.entities.UserAccount;
import com.tanker.interfaces.UserInterfaces;

@RestController
public class UserAccountController {
	
	@Autowired
	UserInterfaces usrint;
	
	@PostMapping("/create")
	public void addUserAccount(@RequestBody UserAccount usracc) {
		usrint.save(usracc);
	}

}
