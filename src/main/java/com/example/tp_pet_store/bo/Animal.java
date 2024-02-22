package com.example.tp_pet_store.bo;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// strategy = GenerationType.IDENTITY enléve les _seq

    //création des colonnes
    @Column(name = "id")
    private Long id;

    @Column(name = "birth")
    private Date birth;

    @Column(name = "color")
    private String color;

    //création des relations
    @ManyToOne
    @JoinColumn(name = "id_pet_store", referencedColumnName = "id")
    private PetStore petStore;

    //création des getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }

    public Animal() {
    }
}
