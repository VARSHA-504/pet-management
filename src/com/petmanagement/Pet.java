package com.petmanagement;

import java.util.Objects;

public abstract class Pet {
    enum Colour{BLACK, RED, WHITE, BLACK_WHITE, GRAY, GREEN}

    String id;
    String name;
    Colour colour;
    int age;
    int price;

    public abstract void eat();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
