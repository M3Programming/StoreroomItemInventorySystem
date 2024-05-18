package com.joe.Inventory.Model;

import jakarta.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.Serializable;

@Entity
@Table(name = "items")
public class Item implements Serializable {
    private static final Logger logger = LogManager.getLogger(Item.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "description")
    private String description;

   @Column(name = "category")
    private String category;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "location")
    private String location;

    public Item() {
        this.itemName = "";
        this.description = "";
        this.location = "";
    }

    public Item(String itemName, String description, String category, int quantity, String location) {
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.quantity = quantity;
        this.location = location;
    }

    // Getter methods
    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLocation() {
        return location;
    }

    // Setter methods
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Logging method
    public void logItemInfo() {
        logger.info("Item ID: {}, Name: {}, Description: {}, Category: {}, Quantity: {}, Location: {}",
                itemId, itemName, description, category , quantity, location);
    }

    // GetName method
    public String getName() {
        return itemName;
    }

    // SetName method
    public void setName(String name) {
        this.itemName = name;
    }
}
