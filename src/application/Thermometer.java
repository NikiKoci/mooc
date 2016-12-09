/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Niki
 */
public class Thermometer implements Sensor{
    boolean state;
    Random randomizer = new Random();
    
    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void on() {
        state = true;
    }

    @Override
    public void off() {
        state = false;
    }

    @Override
    public int measure() {
        if(!state) throw new IllegalStateException();
        return randomizer.nextInt(61)-30;
    }
    
}
