/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Niki
 */
public class BulkTank {

    double volume;
    double capacity;

    public BulkTank() {
        capacity=2000;
    }

    public BulkTank(double capacity) {
        this.capacity=capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchFreeSpace() {
        return capacity - volume;
    }
    public void addToTank(double amount) {
        volume = Math.min(capacity, amount+volume);
    }
    public double getFromTank(double amount) {
        double taken = Math.min(amount, volume);
        volume = volume - taken;
        return taken;
    }
    public String toString() {
        return Math.ceil(volume)+"/"+Math.ceil(capacity);
    }
}
