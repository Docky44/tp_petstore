package com.example.tp_pet_store.bo;

import jakarta.persistence.*;

@Entity
@Table(name = "Fish")
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private FishLivEnv livingEnv;

    public Fish() {

    }
}
