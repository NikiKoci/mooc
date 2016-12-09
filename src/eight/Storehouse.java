/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Niki
 */
public class Storehouse {
    
    Map<String, Integer> prices = new HashMap<>();
    Map<String, Integer> stocks = new HashMap<>();
    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        stocks.put(product,stock);
    }
    
    public int price(String product)  {
        return prices.get(product);
    }
    public int stock(String product) {
        return stocks.get(product);
    }
    
    public boolean take(String product){
        if(stocks.get(product)>0) {
           stocks.put(product, stocks.get(product)-1 );
           return true;
        }
               return false;
    }
    public Set<String> products(){
        return stocks.keySet();
            
        
 
    }
    
}
