package com.phoenix.JPADemo.repository;

import com.phoenix.JPADemo.dto.UserResDto;
import com.phoenix.JPADemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
