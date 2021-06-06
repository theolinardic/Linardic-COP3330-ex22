/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 22 Solution
 *  Copyright 2021 Theodore Linardic
 */


package oop.ex22;
import java.util.Scanner;

public class ex22 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int userNum1 = userInputScanner.nextInt();
        System.out.print("Enter the second number: ");
        int userNum2 = userInputScanner.nextInt();
        System.out.print("Enter the third number: ");
        int userNum3 = userInputScanner.nextInt();

        int largestNum = userNum1;

        if(userNum1 == userNum2 && userNum1 == userNum3){
            System.exit(0);
        }
        else{
            if(userNum2 > largestNum){
                largestNum = userNum2;
            }
            if(userNum3 > largestNum){
                largestNum = userNum3;
            }
        }

        System.out.print("The largest number is " + largestNum);
    }

}
