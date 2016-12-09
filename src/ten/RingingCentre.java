/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Niki
 */
public class RingingCentre {
    private Map<Bird, List<String>> observations = new HashMap<>();
     public void observe(Bird bird, String place) {
        if(!observations.containsKey(bird)) {
            observations.put(bird, new ArrayList<String>());
        }
        observations.get(bird).add(place);
     }
     public void observations(Bird bird) {
         
         System.out.println(observations.get(bird));
     }
     
}
