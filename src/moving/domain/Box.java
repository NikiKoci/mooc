/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Niki
 */
public class Box implements Thing{
    List<Thing> contents = new ArrayList<>();
    int maximumCapacity;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
    
      public boolean addThing(Thing thing){
          if(thing.getVolume()+getVolume()<=maximumCapacity) {
              contents.add(thing);
              return true;
          }
          return false;
      }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing content : contents) {
            volume+=content.getVolume();
                    
        }
        return volume;
    }
}
