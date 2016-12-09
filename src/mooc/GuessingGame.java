/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit,upperLimit);

        while(lowerLimit!=upperLimit) {
            int avg = average(lowerLimit,upperLimit);
           if(  isGreaterThan(avg)) {
               lowerLimit = Math.max(avg,lowerLimit+1);
           }
           else upperLimit = Math.min(avg,avg-1);
           
        }
        System.out.println("You thought of " + lowerLimit);
    }
    
    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than "+value +" (y/n)");
        return reader.nextLine().equals("y");
    }
    public int average(int firstNumber, int secondNumber) {
        return (firstNumber+secondNumber)/2;
    }
    
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}