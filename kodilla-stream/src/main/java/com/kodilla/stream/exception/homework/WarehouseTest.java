package com.kodilla.stream.exception.homework;

import org.testng.annotations.Test;

public class WarehouseTest {

    @Test

        public void testGetOrder() {
            //given
            Warehouse warehouse = new Warehouse();
            //when
            warehouse.addOrder(new Order("0201"));
            //then
        // dlaczego nie mogę zrobić asserEquals ?
        }
    }

