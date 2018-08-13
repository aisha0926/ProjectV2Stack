package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account saveAccount(Account account) {

		return accountRepository.save(account);
	}

	public Optional<Account> getAccount(Long id) {

		return accountRepository.findById(id);
	}

	public Account editAccount(Account account) {

		return accountRepository.save(account);
	}

	public void deleteAccount(Long id) {

		accountRepository.deleteById(id);
	}

	public List<Account> getAllAcounts() {

		return accountRepository.findAll();
	}

}
