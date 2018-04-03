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
public class Person {
    
    private String Name;
    private String Address;
    private String Surname;
    private Pet[] owns;
    
    public Person(String name, String address, String surname){
        this.Name = name;
        this.Address = address;
        this.Surname = surname;
    }
    
    public String getName() {
        return Name;
    }
    public void setName(String NameP) {
        Name = NameP;
    }
    public void displayPerson() {
        System.out.println("The name of the person is: " + Name);
        System.out.println("Surname: " + Surname);
        System.out.println("Address: " + Address);
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String AddressP) {
        Address = AddressP;
    }
    
    public String getSurname() {
        return Surname;
    }
    public void setSurname(String SurnameP) {
        Surname = SurnameP;
    }
}
