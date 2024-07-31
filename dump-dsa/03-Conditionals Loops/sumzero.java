import java.util.Scanner;
public class sumzero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
        String input = in.nextLine();
        if(Integer.parseInt(input) == 0){
            break;
        }
        try{
            int number = Integer.parseInt(input);
            sum += number;
        } catch(NumberFormatException e){
           System.out.println("Invalid input.Please enter 0 to stop.");
        }
    }
    System.out.println("Sum of numbers: " + sum);
    in.close();
  }
}