package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1015"));
        warehouse.addOrder(new Order("1574"));
        warehouse.addOrder(new Order("8007"));

        try {
            Order order = warehouse.getOrder("1015");
            System.out.println("Found order " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Searched number is wrong");
        }

    }
}
