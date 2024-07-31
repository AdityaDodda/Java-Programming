import java.util.Scanner;
public class math_operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        String op = in.next();
        if (op.equals("+")) {
            System.out.println(num1 + num2);
        } else if (op.equals("-")) {
            System.out.println(num1 - num2);
        } else if (op.equals("*")) {
            System.out.println(num1 * num2);
        } else if (op.equals("/")) {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }
        in.close();
    }
}
