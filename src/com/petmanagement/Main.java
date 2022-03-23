package com.petmanagement;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to pet management system !");

        Animal dog = new Dog("D001") ;
        dog.age = 4;
        dog.price = 1000;
        dog.species = "abc";

        Animal dog1 = new Dog("D001") ;
        dog1.age = 4;
        dog1.price = 1000;
        dog1.species = "abc";

        Animal cat = new Cat("C001");
        cat.age = 3;
        cat.price = 2000;
        cat.species = "efgh";

        Bird parrot = new Parrot("P001");
        parrot.age = 3;
        parrot.price = 3000;
        parrot.breed = "jkl";

        Animal rabbit = new Rabbit("R001");
        rabbit.age = 4;
        rabbit.price = 2000;
        rabbit.species = "mno";

        Bird duck = new Duck("D123");
        duck.age = 2;
        duck.price = 1000;
        duck.breed = "xyz";

        PetStorage petStorage = new PetStorage();
        petStorage.add(dog);
        petStorage.add(cat);
        petStorage.add(parrot);
        petStorage.add(rabbit);
        petStorage.add(duck);

        UserInterface userInterface = new UserInterface();
        //userInterface.print(getStorage. getPetList());
        Set petList = petStorage.getPetList();
        userInterface.print(petList);

        petStorage.remove(cat);
        System.out.println("After removing");
        userInterface.print(petList);
        userInterface.printAnimal(petList);
        userInterface.printBird(petList);
    }
}
