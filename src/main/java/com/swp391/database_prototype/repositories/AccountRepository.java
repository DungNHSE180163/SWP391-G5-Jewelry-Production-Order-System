package com.swp391.database_prototype.repositories;

import com.swp391.database_prototype.pojos.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
