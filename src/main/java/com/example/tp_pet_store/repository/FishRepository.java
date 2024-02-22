package com.example.tp_pet_store.repository;

import com.example.tp_pet_store.bo.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Long> {
}
