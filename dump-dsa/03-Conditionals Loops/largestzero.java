import java.util.Scanner;
import java.lang.Math;
public class largestzero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 1;
        while(true){
          String input = in.nextLine();
          if(Integer.parseInt(input) == 0){
              break;
          }
          try{
              int number = Integer.parseInt(input);
              
          }
          catch(NumberFormatException e){
                System.out.println("Invalid input.Please enter 0 to stop.");  
          }
        }
        System.out.println(max);
        in.close();
    }
}
