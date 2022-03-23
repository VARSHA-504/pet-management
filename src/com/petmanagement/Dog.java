package com.petmanagement;

public class Dog extends Animal implements Swimmable {

    public Dog(String id){
        this.id=id;
        name = "dog";
        colour = Colour.BLACK_WHITE;
    }
    public void eat() {
        System.out.println("Dog eats flesh");
    }

    @Override
    public void swim() {
        System.out.println("Dog can swim");
    }
}