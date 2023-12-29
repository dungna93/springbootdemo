package com.spring.demo.repo;

import com.spring.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @created: 28/12/2023 - 9:38 PM
 * @author: dungna
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
