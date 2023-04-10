package com.example.alten_practicas.repository;

import com.example.alten_practicas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
