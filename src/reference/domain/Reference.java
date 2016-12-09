/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import reference.comparator.FilmComparator;

/**
 *
 * @author Niki
 */
public class Reference {
    RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }
     public Film recommendFilm(Person person){
         List <Film> films = new ArrayList<>();
         for(Film film:register.filmRatings().keySet()) {
             films.add(film);
         }
         Collections.sort(films,new FilmComparator(register.filmRatings()));
         return films.get(1);
     }
    
}
