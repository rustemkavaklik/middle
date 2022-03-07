package com.kvk.middle.dataAccess.abstracts;

import com.kvk.middle.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
