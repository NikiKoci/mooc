/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Niki
 */
public class Cow implements Milkable,Alive{
    String name;
    double capacity;
    double amount;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    static Random randomizer = new Random();
    public Cow() {
        
        this(randomName() );
    }
    public Cow(String name) {
        this.name=name;
        capacity = randomizer.nextInt(26)+15;
    }
    
    private  static String randomName() {
        int rand=randomizer.nextInt(NAMES.length);
        
        return NAMES[rand];
    }

    @Override
    public double milk() {
        double ret = amount;
        amount = 0;
        return ret;
    }

    @Override
    public void liveHour() {
        amount = Math.min(amount+randomizer.nextDouble()+1.3,capacity);
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return name + " "+Math.ceil(amount)+"/"+capacity;
    }
    
    
}
