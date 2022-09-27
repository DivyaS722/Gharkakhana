package com.example.arjun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.arjun.entity.Category;
import com.example.arjun.entity.User;
import com.example.arjun.exception.UserAlreadyExistException;
import com.example.arjun.exception.WrongPasswordException;

import com.example.arjun.repository.IUserRepository;

@Service
@Transactional
public class IUserService {
	@Autowired
    IUserRepository userRepository;

    public List<User> getUsers(){
    	return userRepository.findAll();
    }
    public User userSignUp(User user) throws UserAlreadyExistException {
        User user1 = userRepository.findByUserName(user.getUserName());
        if (user1 != null) {
            throw new UserAlreadyExistException("UserName already exist");
        } else {
            userRepository.save(user);
            return user;
        }
    }

    public User userSignIn(User user) throws WrongPasswordException {
        User user1 = userRepository.findByUserName(user.getUserName());
        if (user.getPassword().equals(user1.getPassword())) {
            return user1;
        } else {
            throw new WrongPasswordException("Wrong Password");
        }
    }
	
}
