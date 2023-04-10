package com.example.alten_practicas.controller;

import com.example.alten_practicas.model.User;
import com.example.alten_practicas.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * Get all users
     * @return 404 if there aren't users or 200 and users
     */
    @GetMapping("/user")
    public ResponseEntity<?> getAllUsers(){
        List <User> result = userService.findAll();
        return (result.isEmpty()) ?
                ResponseEntity.notFound().build() :
                ResponseEntity.ok(result);
    }
    /**
     * Get user by id
     * @param id
     * @return 404 if not found user or 200 and user
     */
    @GetMapping("/user/{id}")
    public ResponseEntity<?> getOneUser(@PathVariable Long id) {
        User result = userService.findById(id).orElse(null);
        return (result == null) ?
                ResponseEntity.notFound().build() :
                ResponseEntity.ok(result);
    }
}
