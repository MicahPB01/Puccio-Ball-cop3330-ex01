package oop.example;

//Exercise 01
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )

    {
        Scanner getUserName = new Scanner(System.in);

        System.out.print( "What is your name? ");

        String userName = getUserName.nextLine();

        System.out.println("Hello, " + userName  +". Nice to meet you!");
    }


}
