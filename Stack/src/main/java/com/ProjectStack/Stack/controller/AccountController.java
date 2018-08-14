package com.ProjectStack.Stack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectStack.Stack.model.Account;
import com.ProjectStack.Stack.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/posts")
	public List<Account> accounts(){
		return accountService.getAllPost();
	}
	
	@PostMapping(value="/posts")
	public void addAccount(@RequestBody Account account) {
		accountService.insert(account);
	}

	@DeleteMapping("/posts/{id}")
	public void deleteAccount(@PathVariable Long id) {
		accountService.deleteAccount(id);
	}

}
