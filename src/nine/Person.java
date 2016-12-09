/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine;

import java.util.HashSet;

/**
 *
 * @author Niki
 */
public class Person implements Comparable<Person>{
    String name;
    HashSet<String> numbers = new HashSet<>();
    String address = null;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashSet<String> getNumbers() {
        return numbers;
    }

    public String getAddress() {
        return address;
    }
    
    public void addNumber(String number) {
        numbers.add(number);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person t) {
        return name.compareTo(t.name);
    }
    
}
