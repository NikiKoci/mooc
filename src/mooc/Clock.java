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
public class Clock {
     private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
    
     public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
      hours = new BoundedCounter(23);
      minutes = new BoundedCounter(59);
      seconds = new BoundedCounter(59);
      hours.setValue(hoursAtBeginning);
      minutes.setValue(minutesAtBeginning);
      seconds.setValue(secondsAtBeginning);
    }

    public void tick(){
      seconds.next();
      if(seconds.toString().equals("00")) {
          minutes.next();
           if(minutes.toString().equals("00")) {
               hours.next();
           }
      }
    }

     @Override
    public String toString() {
        return hours.toString()+":"+minutes.toString()+":"+seconds.toString();
    }
}
