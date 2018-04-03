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
public class Pet {
    
    private String PetName;
    private String PetRace;
    private String AnimalType;
    private int PetAge;
    private Person owner;
    
    public Pet(String petname, String petrace, String animaltype, int petage){
        this.PetName = petname;
        this.PetRace = petrace;
        this.AnimalType = animaltype;
        this.PetAge = petage;
    }
    
    public String getPetName() {
        return PetName;
    }
    public void setPetName(String NamePet) {
        PetName = NamePet;
    }
    public void displayPet() {
        System.out.println("The name of the pet is: " + getPetName());
        System.out.println("The race of the pet is: " + getPetRace());
        System.out.println("The type of the animal is: " + getAnimalType());
        System.out.println("The age of the pet is: " + getPetAge());
    }
    public String getPetRace() {
        return PetRace;
    }
    public void setPetRace(String RacePet) {
        PetRace = RacePet;
    }
    public String getAnimalType() {
        return AnimalType;
    }
    public void setAnimalType(String TypeAnimal) {
        AnimalType = TypeAnimal;
    }
    public int getPetAge() {
        return PetAge;
    }
    public void setPetAge(int AgePet) {
        PetAge = AgePet;
    }
}
