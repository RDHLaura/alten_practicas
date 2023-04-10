package com.example.alten_practicas.service;

import com.example.alten_practicas.model.User;
import com.example.alten_practicas.repository.UserRepository;
import com.example.alten_practicas.service.base.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService extends BaseService<User, Long, UserRepository> {

}
