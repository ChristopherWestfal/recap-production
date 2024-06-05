package org.example.order;

import org.example.interfaces.OrderRepo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {

    Map<Integer,Order> orders = new HashMap<>();
    int counter = 0;

    @Override
    public void addOrder(Order order) {
        counter++;
        orders.put(counter, order);
    }

    @Override
    public void removeOrder(Order order) {
        Iterator<Map.Entry<Integer, Order>> iterator = orders.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, Order> entry = iterator.next();
            if(entry.getValue().equals(order)) {
                iterator.remove();
                counter--;
            }
        }
    }

    @Override
    public Order getOrder(int index) {
        if (orders.containsKey(index))
            return orders.get(index);
        return null;
    }

    @Override
    public Order getOrder(String name) {
        for (Order order : orders.values()) {
            for(int i = 0; i < order.products().size(); i++) {
                if(order.products().get(i).name().equals(name))
                    return order;
            }
        }
        return null;
    }

    @Override
    public void getAll() {
        if(orders.isEmpty()) System.out.println("No orders found");
        else for(Order order : orders.values()){ System.out.println(orders.toString()); }
    }
}
