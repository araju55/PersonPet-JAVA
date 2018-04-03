/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Joseph
 */
public class MainPersonPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Ally", "Thompson Drive", "Luke");
        
        System.out.println("Person name is: " + p.getName());
        System.out.println("Person address is: " + p.getAddress());
        System.out.println("Person surname is: " + p.getSurname());
        
        Pet ap = new Pet("Emily", "Rabbit", "Bunny", 15);
        
        System.out.println("Pet name is : " + ap.getPetName());
        System.out.println("Pet race is: " + ap.getPetRace());
        System.out.println("Type of animal is: " + ap.getAnimalType());
        System.out.println("The age of the pet is: " + ap.getPetAge());
        
    }
    
}
