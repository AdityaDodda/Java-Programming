package Striver;

public class Firstpattern {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < 2*n-1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}