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
public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters>otherApartment.squareMeters;
    }
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(squareMeters*pricePerSquareMeter-otherApartment.squareMeters*otherApartment.pricePerSquareMeter);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return squareMeters*pricePerSquareMeter > otherApartment.squareMeters*otherApartment.pricePerSquareMeter;
    }
}
  