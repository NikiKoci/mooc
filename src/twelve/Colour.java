/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelve;

/**
 *
 * @author Niki
 */
public enum Colour {
    RED("red"), // the constructor parameters are defined as constant values when they are read
    GREEN("green"),
    BLUE("blue");

    private String name; // object variable

    private Colour(String name) { // constructor
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}