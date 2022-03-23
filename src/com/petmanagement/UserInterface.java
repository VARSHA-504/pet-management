package com.petmanagement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UserInterface {

    public void print (Set petList) {
//      for(int i = 0; i < petList.size(); i++) {
//            System.out.println(petList.get(i));
//        }
    }

    public void printAnimal(Set<Pet> petList){
        for(Pet p : petList){
            if (p instanceof Animal){
                System.out.println(p);
            }
        }
    }

    public void printBird(Set <Pet> petList){
        for(Pet p : petList){
            if (p instanceof Bird){
                System.out.println(p);
            }
        }
    }

    public void printSwimmables(){
        for(Pet pet : petList){


        }
    }
}
