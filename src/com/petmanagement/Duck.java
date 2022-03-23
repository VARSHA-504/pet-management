package com.petmanagement;

public class Duck extends Bird implements Flyables, Swimmable{

    public Duck(String id){
        this.id = id;
        name = "duck";
        colour = Colour.WHITE;
    }

    public void eat() {
        System.out.println("Dog eats flesh");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
