/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 3 - Printing Quotes

package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Quotation marks are often used to denote the start and end of a string.
        // But sometimes we need to print out the quotation marks themselves by using escape characters.

        //Create a program that prompts for a quote and an author. Display the quotation
        // and author as shown in the example output.

        //Get quote
        Scanner getQuote = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String Quote = getQuote.nextLine();

        //Get quote's author
        Scanner getAuthor = new Scanner(System.in);
        System.out.print("Who said it? ");
        String Author = getAuthor.nextLine();

        //Print out quote and author of quote

        System.out.println(Author + " says, \"" + Quote+ "\"");

    }

}
