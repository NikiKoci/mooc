/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import personnel.Education;

/**
 *
 * @author Niki
 */
public class Person {
        private String name;
        private String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    Person(String arto, Education education) {
    }

        
        
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
        
     public void changeNumber(String newNumber)  
     {
         number= newNumber;
     }
     public String toString() {
         return name + " number: "+number;
     }
     
}
