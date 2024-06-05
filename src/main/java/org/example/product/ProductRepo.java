package org.example.product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> products;

    public ProductRepo() {
        products = new ArrayList<>();
    }

    public void add(Product product){
        products.add(product);
    }

    public void remove(Product product){
        products.remove(product);
    }

    public Product get(int index){
        return products.get(index);
    }

    public Product get(String name){
        if(products.isEmpty()) return null;
        for(Product product : products){
            if(product.name().equals(name))
                    return product;
        }
        return null;
    }

    public List<Product> getAll(){
        if(products.isEmpty()) return null;
        else return products;
    }
}
