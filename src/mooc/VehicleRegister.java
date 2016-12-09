/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.HashMap;

/**
 *
 * @author Niki
 */
public class VehicleRegister {
    HashMap<RegistrationPlate, String> owners = new HashMap<>();
    public boolean add(RegistrationPlate plate, String owner) {
      if(owners.containsValue(owner)) {
          return false;
      }
      owners.put(plate, owner);
      return true;
    }
    
    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }
}
