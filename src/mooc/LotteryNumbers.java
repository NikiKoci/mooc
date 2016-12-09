/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random randomizer = new Random();

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        for (int i = 0; i < 7; i++) {
            int test = 1+randomizer.nextInt(39);
            if(!containsNumber(test)) numbers.add(test);
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(Integer.valueOf(number));
    }
}
    