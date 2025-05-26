package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products=new ArrayList<>( Arrays.asList(
            new Product(1,"Cassette",50000),
            new Product(2,"Radio",40000),
            new Product(3,"Television",1000000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream().filter(product -> product.getProdId() == prodId).findFirst().orElse(new Product(100,"No product",0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == product.getProdId()) {
                products.set(i, product);
            }
        }
    }

    public void deleteProduct(int prodId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                products.remove(i);
            }
        }
    }
}
