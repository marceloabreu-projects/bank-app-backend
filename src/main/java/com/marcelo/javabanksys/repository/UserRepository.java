package com.marcelo.javabanksys.repository;

import com.marcelo.javabanksys.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);
}