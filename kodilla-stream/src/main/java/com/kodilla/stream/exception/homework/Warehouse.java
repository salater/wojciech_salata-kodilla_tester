package com.kodilla.stream.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orders;

    public void addOrder(Order order) {

    }

    public Warehouse() {
        this.orders = new ArrayList<>();  // lista zamowien
    }

    public void newOrder(Order order) {   //nowe zamowienie
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return (Order) orders
                .stream()
                .filter((order -> order.getNumber().equals(number)))
                .findFirst()
                .orElseThrow(()-> new OrderDoesntExistException("order number: " + number + "it is not exist"));


    }
}

