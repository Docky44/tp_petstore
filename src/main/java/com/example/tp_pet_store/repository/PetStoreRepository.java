package com.example.tp_pet_store.repository;

import com.example.tp_pet_store.bo.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
}
