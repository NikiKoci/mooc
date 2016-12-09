/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Niki
 */
public class ShoppingBasket {
    List<Purchase> basket = new ArrayList<>();
    public void add(String product, int price) {
        for (Purchase purchase : basket) {
           if(purchase.getProduct().equals(product)) {
               purchase.increaseAmount();
               return ;
           }
        }
        basket.add(new Purchase(product, 1, price));
    }
    public int price() {
        int total =0;
        for (Purchase purchase : basket) {
           total += purchase.price();
        }
    return total;
    }
    public void print() {
        for (Purchase purchase : basket) {
            System.out.println(purchase.toString());
        }
    }
    
}
