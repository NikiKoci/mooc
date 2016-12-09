/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.ArrayList;

/**
 *
 * @author Niki
 */
public class Team {
   private String name; 
   private ArrayList<Player> players ;
  
   private int maxSize = 16;
    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
   
    public void addPlayer(Player player) {
       if(size()<maxSize) players.add(player);
    }
    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
    
    public int goals() {
        int goals = 0;
        for (Player player : players) {
            goals += player.goals();
        }
        return goals;
    }
    public void setMaxSize (int maxSize) {
         this.maxSize = maxSize;
    }
    public int size() {
        return players.size();
    }
}
