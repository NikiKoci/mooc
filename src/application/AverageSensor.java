/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Niki
 */
public class AverageSensor implements Sensor{
    ArrayList<Sensor> list = new ArrayList<>();
    List<Integer> readings = new ArrayList<>();
    public void addSensor(Sensor additional){
        list.add(additional);
    }
    
    @Override
    public boolean isOn() {
        boolean on = true;
        for (Sensor sensor : list) {
            if(!sensor.isOn()) on = false;
        }
        return on;
    }

    @Override
    public void on() {
         for (Sensor sensor : list) {
            sensor.on();
        }
    }

    @Override
    public void off() {
    }

    @Override
    public int measure() {
        if(list.isEmpty()||!isOn()) {
            throw new IllegalStateException();
        }
        
        int count = 0;
        int sum = 0;
        for (Sensor sensor : list) {
            sum += sensor.measure();
            count++;
            
        }
        int measured = sum/count;
        readings.add(measured );
        return measured;
        
    }

    public List<Integer> readings() {
        return readings;
        
    }
    
}
