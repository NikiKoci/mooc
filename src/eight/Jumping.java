/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Niki
 */
public class Jumping {

    Scanner reader = new Scanner(System.in);
    ArrayList<Participant> list = new ArrayList<>();
    Random randomizer = new Random();
    int[] points = new int[5];
    public void start() {
        System.out.println("Kumpula ski jumping week \n \n"
                + "Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.println(" Participant name:");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            } else {
                list.add(new Participant(name));

            }
        }
        
        System.out.println("The tournament begins!");
        int round = 0;
        while(true) {
            
            System.out.println("Write \"jump\" to jump; otherwise you quit:");
            if(!reader.nextLine().equals("jump")){
                break;
            }
            else {
                round++;
                System.out.println("Round "+ round);
                System.out.println("");
                System.out.println("Jumping order:");
                Collections.sort(list);
                for (int i = 0; i < list.size(); i++) {
                    Participant participant = list.get(i);
                    System.out.println((i+1)+ ". "+participant.getName()+" ("+participant.getPoints()+" points)");
                }
                System.out.println("Results of round "+ round);
                
                  for (int i = 0; i < list.size(); i++) {
                       Participant participant = list.get(i);
                      System.out.println(participant.getName());
                      int length = randomizer.nextInt(61)+60;
                      participant.addJump(length);
                      System.out.println("length: " + length);
                      for (int j = 0; j < points.length; j++) {
                          points[j] = randomizer.nextInt(11)+10;
                      }
                      System.out.println("judge votes: "+ Arrays.toString(points));
                      Arrays.sort(points);
                      participant.addPoints(length+points[1]+points[2]+points[3]);
                }
            }
        }
        System.out.println("Tournaments results");
        Collections.sort(list);
        System.out.println("Position    Name");
        for (int i = 0; i < list.size(); i++) {
              Participant participant = list.get(i);
            System.out.println(i+1+ "           "+participant.getName()+" ("+participant.getPoints()+ " points)");
                  System.out.print("            jump length:");
                  Collections.sort(participant.getJumps());
                  for (int jumps : participant.getJumps()) {
                      System.out.print(jumps+ " m");
            }
                  System.out.println("");
                    
                }

    }
}
