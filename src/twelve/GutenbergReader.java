/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelve;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class GutenbergReader {
      private List<String> lines;

    public GutenbergReader(String address) throws IllegalArgumentException, MalformedURLException, IOException {
           File file = new File("src/twelve/2554-0.txt");
        Scanner s = new Scanner(file);
        
        while(s.hasNext()) {
            
            lines.add(s.nextLine());
        }
    }

    public List<String> linesWhichComplyWith(Criterion c){
        List<String> complyingLines = new ArrayList<String>();

        for (String line : lines) {
            if (c.complies(line)) {
                complyingLines.add(line);
            }
        }

        return complyingLines;
    }
}
