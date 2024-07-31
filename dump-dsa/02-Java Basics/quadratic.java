// Problem:- https://www.w3resource.com/java-exercises/conditional-statement/index.php

// Write a Java program to solve quadratic equations (use if, else if and else).
// Test Data
// Input a: 1
// Input b: 5
// Input c: 1
// Expected Output :
// The roots are -0.20871215252208009 and -4.7912878474779195

import java.util.Scanner;
import java.lang.Math;
public class quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("The quadratic equation is " + a + "x^2+"+ b + "x+" + c );
        double D = b*b-4*a*c;
        double rootD = Math.sqrt(D);
        if( D > 0){
           System.out.println((-b+rootD)/2*a);
           System.out.println((-b-rootD)/2*a);
        }
        else if(D == 0){
            System.out.println(-b/2*a);
        }
        else if(D < 0){
            System.out.println((-b+rootD)/2*a);
            System.out.println((-b-rootD)/2*a);
        }
        in.close();
    }
}
