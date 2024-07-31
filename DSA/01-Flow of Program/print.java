// Logic:- https://www.baeldung.com/java-read-input-until-condition
import java.util.Scanner;
public class print{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers (enter 'x' to stop):");
        while (true) {
            String input = in.nextLine();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to stop.");
            }
        }
        System.out.println("Sum of the numbers: " + sum);
        in.close();
    }
}