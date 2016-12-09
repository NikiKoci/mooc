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
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }
        // years and months the same, we'll compare the days
        
        return this.year == compared.year && this.month == compared.month &&
                this.day < compared.day;
    }
    public void advance() {
        day++;
        if(day==31) {
            day = 1;
            month++;
            if(month==13) {
                month=1;
                year++;
            }
        }
    }
    
    public void advance(int numberOfDays) {
        for (int i = 0; i <numberOfDays; i++) {
            advance();
        }
    }
    public MyDate afterNumberOfDays(int days) {
         MyDate newMyDate = new MyDate(day,month,year);
         newMyDate.advance(days);
    // some code here

    return newMyDate;
    }
}