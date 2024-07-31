import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        prime();
    }

    static void prime() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("These are the prime numbers in the given range: ");
        for (int i = a;i<=b;i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        in.close();
    }

    // Understand and try to implement this part of code again
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}