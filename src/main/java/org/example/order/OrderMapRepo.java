package org.example.order;

import org.example.interfaces.OrderRepo;

import java.util.HashMap;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {

    Map<Integer,Order> orders = new HashMap<Integer,Order>();
    int counter = 0;

    @Override
    public void addOrder(Order order) {
        counter++;
        orders.put(counter, order);
    }

    @Override
    public void removeOrder(Order order) {


        counter--;
    }

    @Override
    public Order getOrder(int index) {
        return orders.get(index);
    }

    @Override
    public Order getOrder(String name) {
        return null;
    }

    @Override
    public void getAll() {

    }
}
