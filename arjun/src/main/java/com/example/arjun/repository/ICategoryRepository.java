package com.example.arjun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.arjun.entity.Category;
@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {

}
