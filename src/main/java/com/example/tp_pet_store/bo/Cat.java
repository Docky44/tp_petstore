package com.example.tp_pet_store.bo;

import jakarta.persistence.*;

@Entity
@Table(name = "Cat")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private FishLivEnv chipId;

    public Cat() {

    }
}
