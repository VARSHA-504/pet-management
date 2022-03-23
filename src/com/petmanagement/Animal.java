package com.petmanagement;

public abstract class Animal extends Pet {
    String species;

    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
