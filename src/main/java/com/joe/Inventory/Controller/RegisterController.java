/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joe.Inventory.Controller;

import com.joe.Inventory.Model.Item;
import com.joe.Inventory.Model.UserDetail;
import com.joe.Inventory.Service.UserRegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author MJ
 */
@Controller
public class RegisterController {
    private final UserRegisterService userRegisterService;

    public RegisterController(UserRegisterService userRegisterService) {
        this.userRegisterService = userRegisterService;
    }
    
     @GetMapping("/register/new")
    public String registerForm(Model model) {
        UserDetail user = new UserDetail();
        model.addAttribute("user", user);
        return ("register");
    }
    
     @PostMapping("/register")
    public String register(@ModelAttribute("user")UserDetail user){
        userRegisterService.register(user);
        return "redirect:/login";
    }
}
