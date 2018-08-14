package com.ProjectStack.Stack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectStack.Stack.model.Account;


@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
 
}
