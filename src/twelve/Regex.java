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
public class Regex {

    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public static boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u|y)*");
    }

    public static boolean clockTime(String string) {
        if (string.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
            String[] time = string.split(":");
            if (Integer.parseInt(time[0]) >= 0 && Integer.parseInt(time[0]) <= 23
                    && Integer.parseInt(time[1]) >= 0 && Integer.parseInt(time[1]) <= 59
                    && Integer.parseInt(time[2]) >= 0 && Integer.parseInt(time[2]) <= 59) {
                    return true;
            }
        }
        return false;

    }
}
