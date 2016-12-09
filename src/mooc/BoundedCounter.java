/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

/**
 *
 * @author Niki
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = value;
        this.upperLimit = upperLimit;
    }

    public void next() {
        value = (value<upperLimit )? value+1 : 0;
    }
    public void setValue(int value){
        
        this.value = value;
    }
    public String toString() { 
        return ( value<10 ? "0" : "") +value;
    }
}