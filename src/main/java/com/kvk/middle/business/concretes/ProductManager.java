package com.kvk.middle.business.concretes;

import com.kvk.middle.business.abstracts.ProductService;
import com.kvk.middle.dataAccess.abstracts.ProductDao;
import com.kvk.middle.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    private ProductDao productDao;


    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
