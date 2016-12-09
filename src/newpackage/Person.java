/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import mooc.*;

/**
 *
 * @author Niki
 */
public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;
    private MyDate birthMyDate;

    public Person(String name) {
        this(name, 0);  // run here the other constructor's code and set the age parameter to 0
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

  
public Person(String name, int day, int month, int year) {
        this.name = name;
        this.weight = 0;
        this.height = 0;
        this.birthMyDate = new MyDate(day, month, year);
    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double bodyMassIndex() {
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / (heightDividedByHundred * heightDividedByHundred);
    }

    public boolean isAdult() {
        return age < 18 ? false : true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
   public String toString() {
    return this.name + ", born " + this.birthMyDate;
}

    public void becomeOlder() {
        this.becomeOlder(1);
    }

    public void becomeOlder(int years) {
        this.age = this.age + years;
    }
     public boolean olderThan(Person compared) {
        return this.age > compared.age;
        
     }
}
