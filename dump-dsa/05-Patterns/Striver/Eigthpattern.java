package Striver;

public class Eigthpattern {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int row = 0; row < n ; row++) {
            // space
            for (int col = 0; col < row+1 ; col++) {
                System.out.print(" ");
            }
            //star
            for (int col = 0; col < 2*-1 ; col++) {
                System.out.print("*");
            }
//            // space
            for (int col = 0; col < row+1 ; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}