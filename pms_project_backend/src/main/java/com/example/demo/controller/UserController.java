package com.example.demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.repository.UserRepository;
import com.example.demo.model.User;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
    	System.out.println("student added");
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
    	System.out.println("fetching all");
        return userRepository.findAll();
        
    }

//    @GetMapping("/user/{id}")
//    User getUserById(@PathVariable Long id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> new UserNotFoundException(id));
//    }
//
//    @PutMapping("/user/{id}")
//    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
//        return userRepository.findById(id)
//                .map(user -> {
//                    user.setUsername(newUser.getUsername());
//                    user.setName(newUser.getName());
//                    user.setEmail(newUser.getEmail());
//                    return userRepository.save(user);
//                }).orElseThrow(() -> new UserNotFoundException(id));
//    }
//
//    @DeleteMapping("/user/{id}")
//    String deleteUser(@PathVariable Long id){
//        if(!userRepository.existsById(id)){
//            throw new UserNotFoundException(id);
//        }
//        userRepository.deleteById(id);
//        return  "User with id "+id+" has been deleted success.";
//    }



}