package com.phoenix.JPADemo.service;

import com.phoenix.JPADemo.dto.UserReqDto;
import com.phoenix.JPADemo.dto.UserResDto;
import com.phoenix.JPADemo.model.User;
import com.phoenix.JPADemo.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserService {

    UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserResDto toResponse(User user){
        return UserResDto.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .email(user.getEmail())
                .createdAt(user.getCreatedAt())
                .build();
    }

    public  User toEntity(UserReqDto userReqDto){
        return User.builder()
                .username(userReqDto.getUsername())
                .password(userReqDto.getPassword())
                .email(userReqDto.getEmail())
                .build();
    }

    public List<UserResDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map((this::toResponse))
                .toList();
    }


    public UserResDto createUser(UserReqDto userReqDto) {
        return toResponse(userRepository.save(toEntity(userReqDto)));
    }

    public Optional<UserResDto> getUserById(Long id){
        return userRepository.findById(id)
            .map(this::toResponse);
    }

    public void deleteUser(Long id) {
        if(userRepository.existsById(id))
            userRepository.deleteById(id);

    }

    public Optional<UserResDto> findByEmail(String email){
        Optional<User> us = userRepository.findByEmail(email);
        userRepository.deleteAll();
        return us.map(this::toResponse);
    }


}
