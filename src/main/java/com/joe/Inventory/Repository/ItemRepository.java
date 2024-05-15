/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.joe.Inventory.Repository;

import com.joe.Inventory.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author MJ
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
    
}
