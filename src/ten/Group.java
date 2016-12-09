/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ten;

import java.util.ArrayList;

/**
 *
 * @author Niki
 */
public class Group implements Movable{
    ArrayList<Movable> list = new ArrayList<>();
    @Override
    public void move(int dx, int dy) {
        for (Movable organism : list) {
            organism.move(dx, dy);
        }
    }
    public String toString() {
        String out ="";
        for (Movable organism : list) {
            out+=organism.toString()+"\n";
            
        }
        return out;
    }
    public void addToGroup(Movable movable){
        list.add(movable);
    }
    
    
}
