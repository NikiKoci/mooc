/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class Copy {
    public static void main(String[] args) {
    ArrayList<String> teachers = new ArrayList<String>();
    Scanner reader = new Scanner(System.in);
    teachers.add("Anthony");
    teachers.add("Paul");
    teachers.add("John");
    teachers.add("Martin");
    teachers.add("Matt");

    for (String teacher : teachers) {
        System.out.println( teacher );
    }
} 
}
