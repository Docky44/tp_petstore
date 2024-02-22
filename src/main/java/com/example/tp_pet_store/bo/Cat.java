package com.example.tp_pet_store.bo;

import jakarta.persistence.*;

@Entity
@Table(name = "Cat")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// strategy = GenerationType.IDENTITY enléve les _seq

    //création des colonnes
    @Column(name = "chip_id")
    private FishLivEnv chipId;

    public Cat() {

    }
}
