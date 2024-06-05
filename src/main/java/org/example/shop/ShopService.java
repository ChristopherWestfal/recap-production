package org.example.shop;

import org.example.interfaces.OrderRepo;
import org.example.order.Order;
import org.example.order.OrderListRepo;
import org.example.order.OrderMapRepo;
import org.example.product.Product;
import org.example.product.ProductRepo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ShopService {
    OrderRepo orderRepo;
    ProductRepo productRepo = new ProductRepo();

    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;

        productRepo.add(new Product("Säge", "12", new BigInteger("49.99")));
        productRepo.add(new Product("Holz", "15", new BigInteger("11.99")));
        productRepo.add(new Product("Hammer", "13", new BigInteger("14.99")));
        productRepo.add(new Product("Schrauben", "12", new BigInteger("0.99")));
    }

    public void placeOrder(Order order) {
        orderRepo.addOrder(order);
    }

    public void checkProductExistence(String name){
        if(productRepo.getAll().contains(name)){
            System.out.println("Product with name " + name + " already exists");
        }
        else
            System.out.println("Product with name " + name + " does not exist");
    }
}
