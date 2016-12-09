/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.Random;

/**
 *
 * @author Niki
 */
public class NightSky {
    double density;
    int width;
    int height;
    Random randomizer = new Random();
    int starsInLastPrint = 0;
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density) {
        this(density,20,10);
    }
    public NightSky(int width, int height) {
        this(0.1,width,height);
    }
    
    public void printLine(){
        for (int i = 0; i < width; i++) {
            if(randomizer.nextDouble()<density) {
                System.out.print("*");
                starsInLastPrint++;
            }
            else {
                System.out.print(" ");
            }
        
        }
            System.out.println("");
    }
    
    public void print(){
        starsInLastPrint=0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }
    public int starsInLastPrint(){
        return starsInLastPrint;
    }
    
}
