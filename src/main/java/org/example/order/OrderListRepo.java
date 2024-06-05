package org.example.order;

import org.example.interfaces.OrderRepo;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {
    List<Order> orders;

    public OrderListRepo() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(Order order){
        orders.remove(order);
    }

    public Order getOrder(int index){
        return orders.get(index);
    }

    public Order getOrder(String name){
        if(orders.isEmpty()) return null;
        for(Order order : orders){
            if(order.name().equals(name))
                return order;
        }
        return null;
    }

    public void getAll(){
        if(orders.isEmpty()) System.out.println("No orders found");
        else for(Order order : orders){ System.out.println(orders.toString()); }
    }
}
