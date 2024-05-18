/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joe.Inventory.ServiceImpl;

import com.joe.Inventory.Model.UserDetail;
import com.joe.Inventory.Repository.UserDetailRepository;
import com.joe.Inventory.Service.UserRegisterService;
import org.springframework.stereotype.Service;

/**
 *
 * @author MJ
 */
@Service
public class UserRegistrationServiceImpl implements UserRegisterService {

    private final UserDetailRepository userRepository;

    public UserRegistrationServiceImpl(UserDetailRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
    public UserDetail register(UserDetail user) {
         return userRepository.save(user);
    }
    
}
