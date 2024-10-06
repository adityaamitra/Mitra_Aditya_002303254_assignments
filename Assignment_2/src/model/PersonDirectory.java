/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mitra
 */
public class PersonDirectory {
    
    private ArrayList<Person> persons;
    public PersonDirectory()
    {
        this.persons = new ArrayList<Person>();
        
    }
    public ArrayList<Person> getPerson()
    {
        return persons;
        
    }
    public void setPersons(ArrayList<Person> persons)
    {
        this.persons = persons;
        
    }
    public Person addPerson()
    {
        Person a = new Person();
        persons.add(a);
        return a;
    }
    public void deletePerson(Person person)
    {
        persons.remove(person);
    }
    public Person search(String searchInput)
    {
        for(Person a: persons)
        {
            if(a.getFirstName().contains(searchInput) || a.getLastName().contains(searchInput) || 
                    a.getHomeAddress().getStreetAddress().contains(searchInput) || 
                    a.getWorkAddress().getStreetAddress().contains(searchInput)){
                return a;
            }
        }
        return null;
    }  
    
    
}
