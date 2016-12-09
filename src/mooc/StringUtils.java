/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

/**
 *
 * @author Niki
 */
public class StringUtils {
    public static boolean included(String word, String searched) {
        String first =word.trim().toUpperCase();
        String second = searched.trim().toUpperCase();
       // System.out.println(first+ second);
        return first.contains(second);
    }
}
