package org.example.interfaces;

import org.example.order.Order;

public interface OrderRepo {

    public void addOrder(Order order);
    public void removeOrder(Order order);
    public Order getOrder(int index);
    public Order getOrder(String name);
    public void getAll();
}
