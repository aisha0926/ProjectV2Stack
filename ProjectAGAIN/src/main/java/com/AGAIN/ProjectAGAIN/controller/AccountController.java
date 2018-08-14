package com.AGAIN.ProjectAGAIN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AGAIN.ProjectAGAIN.model.Account;
import com.AGAIN.ProjectAGAIN.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/posts")
	public List<Account> account(){
		return accountService.getAllPost();
	}
	
	@PostMapping(value="/posts")
	public void addAccount(@RequestBody Account account) {
		accountService.insert(account);
	}

}
