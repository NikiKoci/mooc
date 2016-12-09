/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class MindfulDictionary {

    File file;
    HashMap<String, String> dictionary = new HashMap<String, String>();

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }

    }

    public String translate(String word) {
        String toReturn = null;

        for (String key : dictionary.keySet()) {
            if (key.equals(word)) {
                toReturn = dictionary.get(key);
            }
        }

        for (String key : dictionary.keySet()) {
            if (dictionary.get(key).equals(word)) {
                toReturn = key;
            }
        }
        return toReturn;
    }

    public void remove(String word) {
        dictionary.remove(word);
        ArrayList<String> toRemove = new ArrayList<>();
        for (String string : dictionary.keySet()) {
            if (dictionary.get(string).equals(word)) {
                toRemove.add(string);
            }
        }

        for (String string : toRemove) {
            dictionary.remove(string);
        }
    }

    public MindfulDictionary(String file) {
        this.file = new File(file);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // the line is split at :
                add(parts[0], parts[1]);

            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(file);
            for (String word : dictionary.keySet()) {
                writer.write(word + ":" + dictionary.get(word)+"\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
