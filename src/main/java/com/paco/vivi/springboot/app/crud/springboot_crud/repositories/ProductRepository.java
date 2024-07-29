package com.paco.vivi.springboot.app.crud.springboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.paco.vivi.springboot.app.crud.springboot_crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}
