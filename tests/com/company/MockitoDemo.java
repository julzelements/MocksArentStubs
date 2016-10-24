package com.company;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class MockitoDemo {

    private static String TEDDY_BEAR = "Teddy Bear";

    @Test
    public void testFillingRemovesInventoryIfInStock() throws Exception {
        //Setup - data
        Order order = new Order(TEDDY_BEAR, 50);
        Warehouse warehouseMock = mock(Warehouse.class);
        when(warehouseMock.hasInventory(TEDDY_BEAR, 50)).thenReturn(true);

        //Use the mock object
        order.fill(warehouseMock);

        //Verify
        verify(warehouseMock).hasInventory(TEDDY_BEAR, 50);
        verify(warehouseMock).remove(TEDDY_BEAR, 50);
        assertTrue(order.isFilled());
    }
}
