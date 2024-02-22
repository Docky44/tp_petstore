package com.example.tp_pet_store.repository;

import com.example.tp_pet_store.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducRepository extends JpaRepository<Product, Long> {
}
