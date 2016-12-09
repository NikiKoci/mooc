/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.ArrayList;

/**
 *
 * @author Niki
 */
public class Phonebook {
    private ArrayList<Person> list;

    public Phonebook() {
        this.list = new ArrayList<Person>();
    }
    public void add(String name, String number) {
        list.add(new Person(name,number));
    }
    
    public void printAll() {
        for (Person person : list) {
         
            System.out.println(person);
        }
    }
    public String searchNumber(String name) {
        for (Person person : list) {
           if(person.getName().contains(name)) {
               return person.getNumber();
           } 
        }
        return "number not known";
     }
    
}
