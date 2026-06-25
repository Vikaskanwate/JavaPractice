package com.phoenix.JPADemo.controller;

import com.phoenix.JPADemo.dto.UserReqDto;
import com.phoenix.JPADemo.dto.UserResDto;
import com.phoenix.JPADemo.model.User;
import com.phoenix.JPADemo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<UserResDto>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/create")
    public ResponseEntity<UserResDto> createUser(@RequestBody UserReqDto userReqDto){
        return ResponseEntity.ok(userService.createUser(userReqDto));
    }

    @GetMapping("user/{id}")
    public ResponseEntity<UserResDto> getUserById(@PathVariable Long id){
        Optional<UserResDto> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(404).build());
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@RequestParam("id") Long id){
        userService.deleteUser(id);
        return ResponseEntity.status(204).build();
    }

    @GetMapping
    public ResponseEntity<UserResDto> getByEmail(@RequestParam("email") String email){
        Optional<UserResDto> us = userService.findByEmail(email);
        return us.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.status(404).build());
    }
}
