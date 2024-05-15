/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joe.Inventory.ServiceImpl;

import com.joe.Inventory.Model.UserDetail;
import com.joe.Inventory.Repository.UserDetailRepository;
import com.joe.Inventory.Service.UserDetailService;
import org.springframework.stereotype.Service;

/**
 *
 * @author MJ
 */
@Service
public class UserDetailServiceImpl extends UserDetailService {

      private final UserDetailRepository userDetailRepository;
    
    public UserDetailServiceImpl(UserDetailRepository userDetailRepository){
       this.userDetailRepository = userDetailRepository;
    }
     
        public UserDetail findByUsername(String username){
            return userDetailRepository.findByUsername(username);
        }
   
}
