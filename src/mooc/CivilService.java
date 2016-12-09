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
public class CivilService implements NationalService{
    private int daysLeft;

    public CivilService(int daysLeft) {
        this.daysLeft = 362;
    }
    
    @Override
    public int getDaysLeft(){
        return daysLeft;
    }
    
    @Override
    public void work() {
        daysLeft--;
    }
    
}
