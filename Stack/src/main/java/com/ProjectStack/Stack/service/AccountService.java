package com.ProjectStack.Stack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectStack.Stack.model.Account;
import com.ProjectStack.Stack.repo.AccountRepo;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepo accountRepo;
	
	public List<Account> getAllPost() {
		return accountRepo.findAll();
	}

	public void insert(Account account) {
		accountRepo.save(account);
	}
	
	public void deleteAccount(Long id) {
		accountRepo.deleteById(id);
	}
	
	
}
