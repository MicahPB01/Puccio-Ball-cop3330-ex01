package oop.example;

//Exercise 01
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )

    {
        Scanner getUserName = new Scanner(System.in);

        System.out.print( "What is your first name? ");

        String userName = getUserName.nextLine();

        System.out.printf("Hello %s, nice to meet you!\n", userName);





    }


}
