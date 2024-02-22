package com.example.tp_pet_store.bo;

import jakarta.persistence.*;

@Entity
@Table(name = "Fish")
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// strategy = GenerationType.IDENTITY enléve les _seq

    //création des colonnes
    @Column(name = "living_env")
    private FishLivEnv livingEnv;

    public Fish() {

    }
}
