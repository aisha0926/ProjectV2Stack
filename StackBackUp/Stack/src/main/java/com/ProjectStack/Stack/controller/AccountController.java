package com.ProjectStack.Stack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ProjectStack.Stack.model.Account;
import com.ProjectStack.Stack.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/accounts")
	public List<Account> endPoint(){
		return accountService.getAllPost();
	}
	
	@PostMapping("/accounts")
	public Account addAccount( Account account) {
		
		return	accountService.insert(account);
		
	}
	
//	@PostMapping("/accounts")
//	private void register(@RequestBody AccountEndPoint userRegistration) {
//		if(userRegistration.getAccountNumber().equals(userRegistration)) {
//			System.out.println("Error");
//		} else {
//			serviceClass.insert(userRegistration);
//		}
//	}
}
