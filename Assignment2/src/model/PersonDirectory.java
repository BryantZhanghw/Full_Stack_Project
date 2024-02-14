/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import model.Person;

/**
 *
 * @author martta
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory() {
        personList = new ArrayList<>();
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    //search by first name or street address and return the person object
    public Person searchPerson(String inpuString) {
        for (Person person : personList) {
            if (person.getFirstname().equals(inpuString) ||
                person.getHomeAddress().getStreetAddress().equals(inpuString) ||
                person.getWorkAddress().getStreetAddress().equals(inpuString)) {
                return person;
            }
        }
        return null;
        
    }

    //search by street address and return the person object
   
    public Person searchPerson(String firstName, String streetAddress) {
        for (Person person : personList) {
            if (person.getFirstname().equals(firstName) &&
                (person.getHomeAddress().getStreetAddress().equals(streetAddress) ||
                 person.getWorkAddress().getStreetAddress().equals(streetAddress))) {
                return person;
            }
        }
        return null;
    }


    // Method to get all persons
    public List<Person> getAllPersons() {
        return new ArrayList<>(personList);
    }
}
