import java.util.Scanner;
public class properties {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Factors of " + num1 + ":");
        Factors(num1);

        System.out.println("Factors of " + num2 + ":");
        Factors(num2);

        int hcf = HCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

        int lcm = LCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        in.close();
    }

    public static void Factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int HCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int LCM(int num1, int num2) {
        return (num1 * num2) / HCF(num1, num2);
    }
}