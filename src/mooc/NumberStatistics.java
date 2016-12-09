/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        amountOfNumbers=0;
        sum=0;
    }

    public void addNumber(int number) {
        amountOfNumbers++;
        sum+=number;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public double average() {
      return sum/(double)amountOfNumbers;
    }

    public int sum() {
        return sum;
    }
}
    