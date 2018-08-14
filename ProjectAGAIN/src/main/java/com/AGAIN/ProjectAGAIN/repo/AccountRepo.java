package com.AGAIN.ProjectAGAIN.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AGAIN.ProjectAGAIN.model.Account;


@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

}
