package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTestWithMock {
    private static String TEDDYBEAR = "Teddy Bear";
    private MockWarehouse mockWarehouse;

    @Before
    public void setUp() throws Exception {
        mockWarehouse = new MockWarehouse();
    }

    @Test
    public void testOrderIsFilledIfEnoughInWarehouse() {
        Order order = new Order(TEDDYBEAR, 50);
        order.fill(mockWarehouse);
        assertTrue(order.isFilled());
        assertEquals(0, mockWarehouse.getInventory(TEDDYBEAR));
    }

}
