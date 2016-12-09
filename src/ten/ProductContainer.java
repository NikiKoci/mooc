/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ten;

/**
 *
 * @author Niki
 */
public class ProductContainer extends Container{
    private String name;
    public ProductContainer(String productName, double capacity) {
        super(capacity);
        name = productName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name +": "+super.toString();
    }
    
}
