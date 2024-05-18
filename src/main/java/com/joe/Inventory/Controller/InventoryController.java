/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joe.Inventory.Controller;

import com.joe.Inventory.Service.UserDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author MJ
 */
@Controller
public class InventoryController {
    
    
   private final UserDetailService userDetailService;
     

    public InventoryController(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    } 
     @GetMapping("")
    public String index() {             
        return ("index");
    }
    @GetMapping("/register")
     public String register() {             
        return ("register.html");
    }
    
   @GetMapping("/login")
    public String login() {
        return "login";
    }
}
