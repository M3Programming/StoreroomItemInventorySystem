/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joe.Inventory.Service;

import com.joe.Inventory.Model.Item;
import java.util.List;

/**
 *
 * @author MJ
 */

public interface ItemService {
    List<Item> getAllItems();
    Item saveItem (Item item);
}
