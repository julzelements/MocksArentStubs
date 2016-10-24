package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTest {

    private static String TEDDYBEAR = "Teddy Bear";
    private Warehouse warehouse;

    @Before
    public void setUp() throws Exception {
        warehouse = new Warehouse();
        warehouse.add(TEDDYBEAR, 50);
    }

    @Test
    public void testOrderIsFilledIfEnoughInWarehouse() {
        Order order = new Order(TEDDYBEAR, 50);
        order.fill(warehouse);
        assertTrue(order.isFilled());
        assertEquals(0, warehouse.getInventory(TEDDYBEAR));
    }
}
