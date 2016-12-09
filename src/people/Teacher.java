/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Niki
 */
public class Teacher  extends Person{
    int salary;
    public Teacher(String name, String address,int salary) {
        super(name, address);
        this.salary=salary;
    }
    public String toString() {
        return super.toString()+" \n   salary " + salary + " euros/months";
    }
}
