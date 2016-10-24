package com.company;

public class Order {

    private String inventory;
    private Integer quantity;
    private Boolean isFilled;

    public Order(String lineItem, int quantity) {
        this.inventory = lineItem;
        this.quantity = quantity;
        this.isFilled = false;
    }

    public void fill(Warehouse warehouse) {
        if (warehouse.hasInventory(inventory, quantity)) {
            warehouse.remove(inventory, quantity);
            isFilled = true;
        }
    }

    public boolean isFilled() {
    return isFilled;
    }
}
