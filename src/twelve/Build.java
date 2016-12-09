/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelve;

/**
 *
 * @author Niki
 */
public class Build {
    public static String build(int[] t) {
        StringBuilder text = new StringBuilder(100);
        text.append("{");
        for (int i = 0; i < t.length; i++) {
            text.append(t[i]);
            
            if (i != t.length - 1) {
                text.append (", ");
                if((i+1)%4==0) {
                text.append("\n");
            }
            }
        }
        text.append("}");
        return text.toString();
    }
}
