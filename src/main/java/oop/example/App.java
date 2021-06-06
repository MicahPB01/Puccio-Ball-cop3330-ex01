package oop.example;

//Exercise 01
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Micah Puccio-Ball
 */

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )

    {
        Scanner getUserName = new Scanner(System.in);

        System.out.print( "What is your name? ");

        String userName = getUserName.nextLine();
        String output = "Hello, " + userName  +". Nice to meet you!";

        System.out.println(output);
    }


}
