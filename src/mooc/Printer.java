/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class Printer {
    File file;
     public Printer(String fileName) throws Exception {
     file = new File(fileName);
   }
     
     public void printLinesWhichContain (String word) throws FileNotFoundException {
         Scanner reader = new Scanner(file);
         while(reader.hasNext()){
             String line = reader.nextLine();
             if (line.contains(word)){
                 System.out.println(line);
             }
         }
     }
}
