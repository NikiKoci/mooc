/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight;

/**
 *
 * @author Niki
 */
public class CD implements ToBeStored{
    String artist;
    String title;
    int year;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
    
    @Override
    public double weight () {
        return 0.1;
    }

    @Override
    public String toString() {
        return "CD{" + "artist=" + artist + ", title=" + title + ", year=" + year + '}';
    }
    
    
}
