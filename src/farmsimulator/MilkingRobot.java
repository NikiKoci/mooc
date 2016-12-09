/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Niki
 */
public class MilkingRobot {

    private BulkTank tank = null;

    public MilkingRobot() {

    }

  public  BulkTank getBulkTank() {
        return tank; 
    }

   public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

   public void milk(Milkable milkable) {
        if(tank==null) {
            throw new IllegalStateException();
        }
        else {
            tank.addToTank( milkable.milk());
        }
    }
}
