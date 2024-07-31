import java.util.Scanner;
public class while_loops{
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's condition remains true
    Scanner scanner = new Scanner(System.in);
    String name = "";
    while(name.isBlank()){
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        // in this code if we use scanner.close() the statement gets stopped if the user has not entered the name once also 
     // in the loop we have to not use scanner.close()   
    } 
    scanner.close();
    System.out.println("Hello "+name); 
    /* do{
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
    }while(name.isBlank());
    scanner.close();
    System.out.println("Hello "+name);
    */
    }
}