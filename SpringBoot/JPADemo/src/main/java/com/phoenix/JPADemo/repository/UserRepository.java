package com.phoenix.JPADemo.repository;

import com.phoenix.JPADemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
