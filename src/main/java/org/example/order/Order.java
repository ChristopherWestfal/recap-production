package org.example.order;


import org.example.product.Product;

import java.math.BigDecimal;
import java.util.List;

public record Order(String orderNumber, List<Product> products) {

    public BigDecimal totalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : products) {
            total = total.add(product.price().multiply(BigDecimal.valueOf(product.quantity())));
        }

        return total;
    }

    public void modifyProductQuantity(Product product, int quantity) {
        for (Product p : products) {
            if(p.equals(product)) {
                p = new Product(p.name(), p.itemNumber(), p.price(), quantity);
                System.out.println("Product " + p.name() + " has been modified");
            }
        }
    }
}
