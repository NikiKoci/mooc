/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Niki
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    int duplicates = 0;
    Set<String> strings = new HashSet<>();
    @Override
    public void add(String characterString) {
        if(strings.contains(characterString)) {
            duplicates++;
        }
        else {
            strings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return strings;
    }

    @Override
    public void empty() {
        strings.clear();
        duplicates = 0;
    }
    
}
