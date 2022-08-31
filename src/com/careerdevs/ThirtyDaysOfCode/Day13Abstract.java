package com.careerdevs.ThirtyDaysOfCode;

// when creating an abstract class we are not able to instantiate objects within this class at all,
// An abstract classes contains abstract method, concrete methods or both.
// Any class which extends abstract class must override all methods of abstract class
// An abstract class can contain either 0 or more abstract method.

//  in this  problem we did not use access modifiers public, private, protected, or default .
//


import java.awt.print.Book;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class Day13Abstract {

    class  MyBook extends Book {
        int price;

        /**
         *   Class Constructor
         *
         *   @param title The book's title.
         *   @param author The book's author.
         *   @param price The book's price.
         **/
        // Write your constructor here



/// This is an extended class from  the Book class created
        MyBook (String title, String author, int price){

            // The fields instantiated from the SuperClass , we use the super method to instantiate it
            super(title, author);

            // this is the new field we set  within the subclass
            this.price = price;

        }

        /**
         *   Method Name: display
         *
         *   Print the title, author, and price in the specified format.
         **/
        // Write your method here

        void display(){

            //this is the abstract method that was instantiated within the SuperClass,
            // we are calling this display method in this sub class and outputting the values that we want.
            System.out.println("Title: "+ title +"\n"+"Author: " + author+ "\n" +"Price: " +price);
        };







// End class
    }
}
