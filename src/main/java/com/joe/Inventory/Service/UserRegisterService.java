/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.joe.Inventory.Service;

import com.joe.Inventory.Model.UserDetail;
import org.springframework.stereotype.Service;

/**
 *
 * @author MJ
 */
@Service
public interface UserRegisterService {
    UserDetail register(UserDetail user);
}
