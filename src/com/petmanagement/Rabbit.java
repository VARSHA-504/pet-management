package com.petmanagement;

public class Rabbit extends Animal {

    public Rabbit(String id){
        this.id = id;
        name = "rabbit";
        colour = Colour.WHITE;
    }

    public void eat() {
        System.out.println("Dog eats flesh");
    }
}
