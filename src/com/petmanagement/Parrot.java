package com.petmanagement;

public class Parrot extends Bird implements Flyables{

    public Parrot(String id){
        this.id = id;
        name = "parrot";
        colour = Colour.GREEN;
    }
    public void eat() {
        System.out.println("Dog eats flesh");
    }

    @Override
    public void fly() {
        System.out.println ("Parrot can fly");
    }
}
