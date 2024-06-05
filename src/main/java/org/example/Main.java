package org.example;

import org.example.order.OrderListRepo;
import org.example.shop.ShopService;

public class Main {
    public static void main(String[] args) {
        ShopService shopService =  new ShopService(new OrderListRepo());

        shopService.checkProductExistence("Säge");
    }
}