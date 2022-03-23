package com.petmanagement;

public abstract class Bird extends Pet{
    String breed;

    public String toString() {
        return "Bird{" +
                "breed='" + breed + '\'' +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
