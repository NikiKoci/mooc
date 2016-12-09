/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;


/**
 *
 * @author Niki
 */
public class FilmComparator implements Comparator<Film>{
Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }
    
    
    @Override
    public int compare(Film t, Film t1) {
        double avg;
        double avg1;
        double sum =0;
        
        for (Rating rating: ratings.get(t)) {
            sum+=rating.getValue();
        }
        avg = sum/ratings.get(t).size();
        sum=0;
         for (Rating rating: ratings.get(t1)) {
            sum+=rating.getValue();
        }
        avg1 = sum/ratings.get(t1).size();
        
        return (int)(100*(avg1-avg));
    }
    
}
