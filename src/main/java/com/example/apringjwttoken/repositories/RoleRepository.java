package com.example.apringjwttoken.repositories;

import com.example.apringjwttoken.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
