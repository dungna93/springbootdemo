package com.spring.demo.repo;

import com.spring.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @created: 04/01/2024 - 7:55 PM
 * @author: dungna
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
