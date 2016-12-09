/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;

/**
 *
 * @author Niki
 */
public class Farm implements Alive{
    String owner;
    Barn barn;
    ArrayList<Cow> herd;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        herd = new ArrayList<>();
    }
    
    
    @Override
    public void liveHour() {
        for (Cow cow : herd) {
            cow.liveHour();
        }
    }
    public void manageCows() {
        barn.takeCareOf(herd);
    }
    
    public void addCow(Cow cow) {
        herd.add(cow);
    }

    @Override
    public String toString() {
          String text = "Farm owner: "+owner +"\nBarn bulk tank: "+ barn.getBulkTank().getVolume()+"/"+barn.getBulkTank().getCapacity()+"\n";
        if(herd.isEmpty()) {
          text+=  "No cows.";
        
        }
        else {
      text+= "Animals:";
        for (Cow cow : herd) {
            text+="\n";
            text+=cow.toString();
        }
     
    }
           return  text;
    }

    public String getOwner() {
        return owner;
    }

    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }
    
    
    
}
