package com.example.arjun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.arjun.entity.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, String>  {

	Admin findBymailId(String mailId);

}
