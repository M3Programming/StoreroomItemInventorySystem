/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joe.Inventory.Controller;

import com.joe.Inventory.Model.Item;
import com.joe.Inventory.Service.ItemService;
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
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    
      @GetMapping("/items")
    public String listStudents(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        return "items";
    }
    
    @GetMapping("/items/new")
    public String itemForm(Model model) {
        Item item = new Item();
        model.addAttribute("items", item);
        return ("AddItem");
    }
    
     @PostMapping("/items")
    public String saveStudent(@ModelAttribute("items")Item item){
        itemService.saveItem(item);
        return "redirect:/items";
    }
}
