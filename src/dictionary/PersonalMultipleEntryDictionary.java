/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Niki
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
     private Map<String,Set<String>> dictionary = new HashMap<>(); 
    
    @Override
    public void add(String word, String translation) {
        if(!dictionary.containsKey(word)) {
            dictionary.put(word, new HashSet<String>());
        }
        dictionary.get(word).add(translation);
    }

    @Override
    public Set<String> translate(String word) {
        return dictionary.get(word);
    }

    @Override
    public void remove(String word) {
        dictionary.remove(word);
    }
    
}
