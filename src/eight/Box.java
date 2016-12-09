/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight;

import java.util.ArrayList;

/**
 *
 * @author Niki
 */
public class Box implements ToBeStored{
    double maximum;
   
    ArrayList<ToBeStored> list = new ArrayList<ToBeStored>();
    public Box(double maximum) {
        this.maximum = maximum;
       
    }
    
    public void add(ToBeStored item) {
        list.add(item);
    }
    public double weight() {
        double weight = 0;
        for (ToBeStored toBeStored : list) {
            weight += toBeStored.weight();
        }
        return weight;
    }
    public String toString() {
        return "Box: " + list.size() +" things, total weight "+ weight() +" kg";
    }
}
