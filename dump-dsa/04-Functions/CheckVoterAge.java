import java.util.Scanner;
public class CheckVoterAge {
    public static void main(String[] args) {
        voterage();
    }

    static void voterage(){
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age > 18){
            System.out.println("The person is eligible to vote.");
        }else{
            System.out.println("The person is not eligible to vote.");
        }
        in.close();
    }
}
