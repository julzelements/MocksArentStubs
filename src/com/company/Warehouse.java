package com.company;

import java.util.HashMap;

public class Warehouse {

    private HashMap<String, Integer> stock;

    public Warehouse() {
        this.stock = new HashMap<>();
    }

    public int getInventory(String inventory) {
        return stock.get(inventory);
    }

    public Boolean hasInventory(String inventory, Integer quantity) {
        if (stock.get(inventory) >= quantity) {
            return true;
        }
        return false;
    }

    public void add(String inventory, Integer quantity) {
        stock.put(inventory, quantity);
    }

    public void remove(String inventory, Integer quantity) {
        stock.put(inventory, stock.get(inventory) - quantity);
    }
}
