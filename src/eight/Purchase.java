/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight;

/**
 *
 * @author Niki
 */
public class Purchase {

    String product;
    int amount;
    int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    public int price(){
        return amount*unitPrice;
    }
    public void increaseAmount() {
        amount++;
    }
    public String getProduct() {
        return product;
    }
    
    public String toString() {
        return product +": " + amount;
    }
}
