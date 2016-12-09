/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Niki
 */
public class RatingRegister {

    HashMap<Film, List<Rating>> ratings = new HashMap<>();
    HashMap<Person, Map<Film,Rating>> personalRatings = new HashMap<>();
    public void addRating(Film film, Rating rating) {
        if (!ratings.containsKey(film)) {
            ratings.put(film, new ArrayList<>());
        }

        ratings.get(film).add(rating);
    }
    public void addRating(Person person, Film film, Rating rating) {
        addRating(film, rating);
        if(!personalRatings.containsKey(person)) {
            personalRatings.put(person, new HashMap<>());
        }
        personalRatings.get(person).put(film, rating);
    }
    
    public Rating getRating(Person person, Film film) {
        if(personalRatings.get(person).containsKey(film)) {
            return personalRatings.get(person).get(film);
        }
        else return Rating.NOT_WATCHED;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        return personalRatings.get(person);
    }
    
    public List<Person> reviewers() {
        List<Person> ret = new ArrayList<>();
        for (Person person : personalRatings.keySet()) {
            ret.add(person);
        }
        return ret;
    }
    
    public List<Rating> getRatings(Film film) {
        return ratings.get(film);
    }
    public Map<Film, List<Rating>> filmRatings() {
        return ratings;
    }
    
}
