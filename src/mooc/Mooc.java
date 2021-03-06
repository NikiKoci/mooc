/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import application.AverageSensor;
import application.ConstantSensor;
import application.Sensor;
import application.Thermometer;
import dictionary.MindfulDictionary;
import dictionary.MultipleEntryDictionary;
import dictionary.PersonalMultipleEntryDictionary;
import eleven.GraphicCalculator;
import eleven.ThirtySeven;
import farmsimulator.Alive;
import farmsimulator.Barn;
import farmsimulator.BulkTank;
import farmsimulator.Cow;
import farmsimulator.Farm;
import farmsimulator.Milkable;
import farmsimulator.MilkingRobot;
import file.Analysis;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import mooc.logic.ApplicationLogic;
import eleven.UserInterface;
import javax.swing.SwingUtilities;
import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;
import nine.Search;
import noticeboard.NoticeBoard;
import ten.Bird;
import ten.Group;
import ten.Organism;
import ten.RingingCentre;
import personnel.Education;
import people.Student;
import people.Teacher;
import personnel.Education;
import personnel.Employees;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;
import reference.domain.RatingRegister;
import reference.domain.Reference;
import ten.ProductContainer;
import ten.ProductContainerRecorder;
import tools.DuplicateRemover;
import tools.PersonalDuplicateRemover;
import twelve.Build;
import twelve.ContainsWord;
import twelve.Criterion;
import twelve.GutenbergReader;
import twelve.Regex;

/**
 *
 * @author Niki
 */
public class Mooc {

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
    GutenbergReader book = new GutenbergReader(address);

    Criterion criterion = new ContainsWord("beer");

    for (String line : book.linesWhichComplyWith(criterion)) {
        System.out.println(line);
    }
    
    }
}
