// Problem:- https://www.w3resource.com/java-exercises/conditional-statement/index.php

// Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
// Test Data
// Input a number: 25
// Expected Output :
// Input value: 25
// Positive number

import java.util.Scanner;
public class floatingpoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num = in.nextFloat();
        if(num == 0){
            System.out.println("zero");
        }
        else if(num>0){
            System.out.println("positive");
        }
        else if(num<0){
            System.out.println("negative");
        }
        else if(num<1 && num>0){
            System.out.println("small");
        }
        else if(num>1000000){
            System.out.println("large");
        }
        in.close();
    }
}
