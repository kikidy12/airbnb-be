package com.example.airbnbpractice.repository;

import com.example.airbnbpractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndNickname(String email, String nickName);

}
