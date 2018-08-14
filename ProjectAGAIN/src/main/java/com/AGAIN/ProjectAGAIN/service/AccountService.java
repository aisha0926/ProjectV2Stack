package com.AGAIN.ProjectAGAIN.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AGAIN.ProjectAGAIN.model.Account;
import com.AGAIN.ProjectAGAIN.repo.AccountRepo;

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
}
