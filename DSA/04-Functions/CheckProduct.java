import java.util.Scanner;
public class CheckProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int d = input.nextInt();
        System.out.println(product(c,d));
        input.close();
    }

    static int product(int a,int b){
        int multiply = a*b;
        return multiply;
    }
}