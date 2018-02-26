package com.learn.springboot.hcmapp.repository;

import com.learn.springboot.hcmapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByName(String username);
}