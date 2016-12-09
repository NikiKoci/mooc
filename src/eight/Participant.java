/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight;

import java.util.ArrayList;

/**
 *
 * @author Niki
 */
public class Participant implements Comparable<Participant>{
    String name;
    int points;
    ArrayList<Integer> jumps = new ArrayList<>();
    Participant(String nextLine) {
        name = nextLine;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<Integer> getJumps() {
        return jumps;
    }
    
    public void addJump(int length) {
        jumps.add(length);
    }
    
     public void addPoints(int added) {
        this.points+= added;
    }
    @Override
    public int compareTo(Participant t) {
        return this.getPoints()-t.getPoints();
    }
    
    
}
