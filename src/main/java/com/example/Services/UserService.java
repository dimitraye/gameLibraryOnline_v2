package com.example.Services;

import com.example.Entities.User;
import com.example.Repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;


    //Create
    public User saveUser(User user){
        return userRepository.save(user);
    }


    //Show one
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }



    //Show all
    public List<User> findAll() {
        return userRepository.findAll();
    }


    //Update
    public User updateUser(User user){
        return userRepository.save(user);
    }


    //Delete
    public void deleteUser(Long id){
         userRepository.deleteById(id);
    }
}
