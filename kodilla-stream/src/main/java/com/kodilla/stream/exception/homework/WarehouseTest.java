package com.kodilla.stream.exception.homework;

import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class WarehouseTest {

    @Test

        public void testGetOrder() {
            //given
            Warehouse warehouse = new Warehouse();
            //when
           // warehouse.addOrder(new Order("0201"));
            //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("0201"));
        }
    }

