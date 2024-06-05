package org.example.shop;

import org.example.order.Order;
import org.example.order.OrderListRepo;
import org.example.product.Product;
import org.example.product.ProductRepo;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    OrderListRepo orderListRepo = new OrderListRepo();
    ProductRepo productRepo = new ProductRepo();

    public void placeOrder(Order order) {
        orderListRepo.addOrder(order);
    }

    public void checkProductExistence(String name){
        if(productRepo.getAll().contains(name)){
            System.out.println("Product with name " + name + " already exists");
        }
        else
            System.out.println("Product with name " + name + " does not exist");
    }
}
