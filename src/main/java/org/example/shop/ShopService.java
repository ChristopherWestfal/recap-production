package org.example.shop;

import org.example.interfaces.OrderRepo;
import org.example.order.Order;
import org.example.product.Product;
import org.example.product.ProductRepo;

import java.math.BigDecimal;
import java.util.List;

public class ShopService {
    OrderRepo orderRepo;
    ProductRepo productRepo = new ProductRepo();

    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;

        productRepo.add(new Product("Säge", "12", new BigDecimal("49.99"), 100));
        productRepo.add(new Product("Holz", "15", new BigDecimal("11.99"), 100));
        productRepo.add(new Product("Hammer", "13", new BigDecimal("14.99"), 100));
        productRepo.add(new Product("Schrauben", "12", new BigDecimal("0.99"), 100));
    }

    public void placeOrder(Order order) {
        orderRepo.addOrder(order);
    }

    public void checkProductExistence(String name){

        List<Product> temp = productRepo.getAll();
        String output = "Product with name " + name + " does not exist";

        for(Product p : temp){
            if(p.name().equals(name))
                output = "Product with name " + name + " already exists";
        }

        System.out.println(output);
    }
}
