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
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
         history = new ContainerHistory();
        
        addToTheContainer(initialVolume);
       
    }

    public String history() {
        return history.toString();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        history.add(volume);
    }
    public double takeFromTheContainer(double amount) {
        double taken = super.takeFromTheContainer(amount);
        history.add(volume);
        return taken;
    }
    
    public void printAnalysis() {
        System.out.println("Greater amount: "+history.maxValue());
        System.out.println("Smallest amount: "+history.minValue());
        System.out.println("Average: "+history.average());
        System.out.println("Great change: "+history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
}
