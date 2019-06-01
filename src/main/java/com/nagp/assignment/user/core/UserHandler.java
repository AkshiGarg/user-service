package com.nagp.assignment.user.core;

import com.nagp.assignment.user.api.CreateUserDto;
import com.nagp.assignment.user.api.UserDto;
import com.nagp.assignment.user.db.User;
import com.nagp.assignment.user.db.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

public class UserHandler {

    private UserRepository userRepository;

    public UserHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.getAllUsers();
        return users.stream().map(UserDto::fromUser).collect(Collectors.toList());
    }

    public void createUser(CreateUserDto createUserDto) {
        User user = CreateUserDto.toUser(createUserDto);
        userRepository.createUser(user);
    }
}
