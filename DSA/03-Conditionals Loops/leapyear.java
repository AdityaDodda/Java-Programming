import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println("Enter the year to check: " + year);
        if(year % 4 == 0){
            System.out.println(year + " is a leap year.");
        }else if(year % 100 == 0){
        if(year % 400 == 0){
            System.out.println(year + " is a leap year.");
           }
           else{
               System.out.println(year + " is not a leap year.");
           }
        }else{
            System.out.println(year + " is not a leap year.");
        }
      in.close();
    }    
}