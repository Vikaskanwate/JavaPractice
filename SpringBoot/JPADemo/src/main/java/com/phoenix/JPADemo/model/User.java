package com.phoenix.JPADemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true,length = 50)
    private String username;
    @Column(nullable = false,unique = true,length = 100)
    private String email;
    @Column(nullable = false,length = 255)
    private String password;
    @Builder.Default
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();


}
