/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ten;

/**
 *
 * @author Niki
 */
public class Container {
   
    double volume;
    double originalCapacity;
    double currentCapacity;
    public Container(double capacity) {
        originalCapacity=capacity;
        currentCapacity=capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double getOriginalCapacity() {
        return originalCapacity;
    }

    public double getCurrentCapacity() {
        return currentCapacity;
    }
    public void addToTheContainer(double amount) {
        if(amount>0) {
            volume=Math.min(volume+amount, currentCapacity);
        }
    }
    
    public double takeFromTheContainer(double amount) {
        double taken;
        if(amount>0) {
            if(amount> volume) {
                taken = volume;
                volume = 0;
            }
            else {
                volume = volume-amount;
                taken = amount;
            }
        }
        else {
            taken = 0;
        }
        return taken;
    }
    
    public String toString(){
        return "volume = "+volume+", free space "+(currentCapacity-volume);
    }
    
}
