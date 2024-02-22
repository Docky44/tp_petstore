package com.example.tp_pet_store.bo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PetStore")
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// strategy = GenerationType.IDENTITY enléve les _seq

    //création des colonnes
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "manager_name")
    private String managerName;

    //création des relations
    @ManyToMany
    @JoinTable(name = "pet_store_product",
            joinColumns = @JoinColumn(name = "id_pet_store", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_product", referencedColumnName = "id")
    )
    private List<Product> products;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Adress address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "petStore")
    private List<Animal> animals;

    //création des getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public PetStore() {
    }

}
