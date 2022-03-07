package com.kvk.middle.business.abstracts;

import com.kvk.middle.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
