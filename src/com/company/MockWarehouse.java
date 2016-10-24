package com.company;

public class MockWarehouse extends Warehouse {

    @Override
    public int getInventory(String inventory) {
        //This method is called by the test method
        // after the teddy bears are removed
        return 0;
    }

    @Override
    public Boolean hasInventory(String inventory, Integer quantity) {
        //We check if the warehouse has 50 teddy bears
        return true;
    }

    @Override
    public void remove(String inventory, Integer quantity) {
        //Do nothing
    }
}
