/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.ArrayList;

/**
 *
 * @author Niki
 */
public class Library {
    ArrayList<Book> list = new ArrayList<>();
    public Library() {
    }
    
   public void addBook(Book newBook) {
       list.add(newBook);
   }
   
   public void printBooks() {
       for (Book book : list) {
           System.out.println(book);
       }
   }
   
    public ArrayList<Book> searchByTitle(String title) {
     ArrayList<Book> found = new ArrayList<Book>();

        for (Book book : list) {
            if(StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }

     return found;
    }
    
    public ArrayList<Book> searchByPublisher(String title) {
     ArrayList<Book> found = new ArrayList<Book>();

        for (Book book : list) {
            if(StringUtils.included(book.publisher(), title)) {
                found.add(book);
            }
        }

     return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
     ArrayList<Book> found = new ArrayList<Book>();

        for (Book book : list) {
            if(book.year()==year) {
                found.add(book);
            }
        }

     return found;
    }
}
