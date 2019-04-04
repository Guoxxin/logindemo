package com.example.logindemo.repository;

import com.example.logindemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author:guoxin
 * @date:2019/4/2 22:42
 * @description:
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    public List<User> findByLoginnameAndPassword(String loginname, String password);
}
