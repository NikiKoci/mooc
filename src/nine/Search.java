/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class Search {

    Scanner reader = new Scanner(System.in);
    HashSet<Person> persons = new HashSet<>();

    public void start() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        while (true) {
            HashSet<String> numbers;
            System.out.println("command: ");
            String command = reader.nextLine();
            if (command.equals("1")) {
                System.out.println("Whose number: ");
                String name = reader.nextLine();
                System.out.println("Number:");
                String number = reader.nextLine();
                if (findByName(name) == (null)) {
                    addPerson(name);
                }
                findByName(name).addNumber(number);
            } else if (command.equals("2")) {
                System.out.println("Whose number: ");
                String name = reader.nextLine();
                findNumber(name);

            } else if (command.equals("3")) {
                System.out.println("Number:");
                String number = reader.nextLine();
                findByNumber(number);

            } else if (command.equals("4")) {
                System.out.println("Whose address");
                String name = reader.nextLine();
                System.out.println("street:");
                String street = reader.nextLine();
                System.out.println("city");
                String city = reader.nextLine();
                if (findByName(name) == (null)) {
                    addPerson(name);
                }
                findByName(name).setAddress(street + " " + city);
            } else if (command.equals("5")) {
                System.out.println("Whose information");
                String name = reader.nextLine();
                Person who = findByName(name);
                if (who == null) {
                    System.out.println("not found");
                } else {
                  
                    findNumber(name);
                }
            } else if (command.equals("6")) {
                System.out.println("Whose information");
                String name = reader.nextLine();
                Person toDelete = null;
                for (Person person : persons) {
                    if (person.getName().equals(name)) {
                        toDelete = person;
                    }
                }
                persons.remove(toDelete);
            }
            else if (command.equals("7")) {
                System.out.println("keyword");
                String name = reader.nextLine();
                
                 for (Person person : persons) {
            if (person.getName().contains(name)||person.getAddress().contains(name)) {
                System.out.println(person.getName());
                findAddress(person);
                findNumber(person.getName());
            }
            }
        }
        }
    }

    private Person findByName(String name) {

        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }

        return null;
    }

    private void addPerson(String name) {
        Person added = new Person(name);
        persons.add(added);
    }

    private void findByNumber(String number) {
        boolean found = false;

        for (Person person : persons) {
            HashSet<String> numbers = person.getNumbers();
            for (String read : numbers) {
                if (read.equals(number)) {
                    System.out.println(person.getName());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("phone number not found");
        }
    }

    private void findNumber(String name) {

        if (findByName(name) != null) {
            HashSet<String> numbers = findByName(name).getNumbers();
            if (numbers.size() == 0) {
                System.out.println("not found");
            } else {
                System.out.println(numbers);
            }
        } else {
            System.out.println("not found");
        }
    }
    private void findAddress (Person who) {
        
          if (who.getAddress() == null) {
                        System.out.println("address not found");
                    } else {
                        System.out.println("address " + who.getAddress());
                    }
    }
}
