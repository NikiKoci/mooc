/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Niki
 */
public class Employees {

    ArrayList<Person> list = new ArrayList<>();

    public void add(Person person) {
        list.add(person);
    }

    public void add(List<Person> persons) {
        list.addAll(persons);

    }
    public void print() {
        for (Person person : list) {
            System.out.println(person);
        }
    }
    
    public void print(Education education) {
        for (Person person : list) {
            if(person.getEducation().equals(education)){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education) {
        ArrayList<Person> fired = new ArrayList<>();
       for (Person person : list) {
            if(person.getEducation().equals(education)){
               fired.add(person);
            }
        } 
       
        for (Person person : fired) {
            list.remove(person);
        }
    }

}
