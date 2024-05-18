/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joe.Inventory.ServiceImpl;

import com.joe.Inventory.Model.Item;
import com.joe.Inventory.Repository.ItemRepository;
import com.joe.Inventory.Service.ItemService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author MJ
 */
@Service
public class ItemServiceImpl implements ItemService{

 private final ItemRepository itemRepository; 

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item getItembyId(Long id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public Item updateItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItembyId(Long id) {
        itemRepository.deleteById(id);
    }
    
  

 
 
}
