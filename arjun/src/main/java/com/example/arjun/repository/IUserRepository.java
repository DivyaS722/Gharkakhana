package com.example.arjun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.arjun.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);

    User findUserById(Integer id);


}
