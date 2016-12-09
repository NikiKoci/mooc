/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;
    
    public Menu() {
        this.meals = new ArrayList<String>();
       
    }
    public void addMeal(String newMeal) {
        meals.add(newMeal);
    }
    public void printMeans(){
        for (String meal : meals) {
            System.out.println(meal);
        }
    }
    // Implement the methods here
}
    