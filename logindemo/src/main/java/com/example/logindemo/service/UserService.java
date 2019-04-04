package com.example.logindemo.service;

import com.example.logindemo.entity.User;
import com.example.logindemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author:guoxin
 * @date:2019/3/20 15:47
 * @description:
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        List<User> all=userRepository.findAll();
        return all;
    }
    public User findById(Integer userId){
        Optional<User> opBlogEntity = userRepository.findById(userId);
        User user = opBlogEntity.get();
        return user;
    }
    public boolean verifyLogin(User user){
        List<User> userList = userRepository.findByLoginnameAndPassword(user.getLoginname(),user.getPassword());
        return userList.size()>0;
    }
}
