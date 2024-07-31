import java.util.Scanner;

public class CheckFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println(Factorial(num1));
        in.close();
    }

    static int Factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
}