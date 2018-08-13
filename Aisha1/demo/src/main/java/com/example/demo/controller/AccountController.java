package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/test")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/account")
	public Account createAccount(@ModelAttribute Account account) {

		return accountService.saveAccount(account);

	}

	@PutMapping("/account")
	public Account editAccount(@ModelAttribute Account account) {

		return accountService.editAccount(account);

	}

	@DeleteMapping("/account/{id}")
	public void deleteAccount(@PathVariable Long id) {

		accountService.deleteAccount(id);

	}

	@GetMapping("/account/{id}")
	public Optional<Account> getAccount(@PathVariable Long id) {

		return accountService.getAccount(id);

	}

	@GetMapping("/account")
	public List<Account> getAllAccount() {

		return accountService.getAllAcounts();

	}

}
