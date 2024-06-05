package org.example.order;

import org.example.product.Product;

import java.util.List;

public record Order(String name, String oderNumber, List<Product> products) {
}
