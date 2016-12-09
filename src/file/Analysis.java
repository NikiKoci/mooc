/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class Analysis {

    File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        int lines = 0;
        while (reader.hasNext()) {
            reader.nextLine();
            lines++;
        }
        return lines;
    }

    public int characters() throws FileNotFoundException {
         Scanner reader = new Scanner(file);
        int lines = 0;
        while (reader.hasNext()) {
           
            lines+= reader.nextLine().length()+1;
        }
        return lines;
    }
    
}
