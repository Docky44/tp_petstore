package com.example.tp_pet_store.bo;

import jakarta.persistence.Table;

@Table(name = "ProdType")
public enum ProdType {
    STANDARD,
    ACCESSORY,
    CLEANING,
}
