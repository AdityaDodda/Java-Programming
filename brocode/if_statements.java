import java.util.Scanner;
public class if_statements{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // if statement = performs a block of code if it's condition evaluates to be true
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.close();
        // one '=' represents assigning,two '==' represents comparing
        if(age>=75){
            System.out.println("Ok Boomer!");
        }
        // for checking more than one conditions we go with else if statements
        else if(age>=18){
            System.out.println("You are an adult!");
        }
        else if(age>=13){
            System.out.println("You are a teenager!");
        }
        else{
            System.out.println("You are not an adult!");
        }
    }
}
