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
import java.util.Random;

public class PasswordRandomizer {
   private int length;
   private Random  randomizer= new Random();

    public PasswordRandomizer(int length) {
        this.length =length;
    }

    public String createPassword() {
        String pass ="";
        for (int i = 0; i < length; i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(randomizer.nextInt(24));
            pass+=symbol;
        }
        return pass;
    }
}
    