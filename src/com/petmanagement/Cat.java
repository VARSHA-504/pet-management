package com.petmanagement;

public class Cat extends Animal {

    public Cat(String id){
        this.id = id;
        name = "cat";
        colour = Colour.BLACK;
    }

    public void eat() {
        System.out.println("Dog eats flesh");
    }
}
