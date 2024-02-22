package com.example.tp_pet_store.repository;

import com.example.tp_pet_store.bo.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
