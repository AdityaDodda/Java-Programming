import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        prime();
    }

    static void prime(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num % 2 != 0 && num % 3 != 0 && num % 5 !=0 && num % 7 !=0 && num % 11 !=0){
                System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number.");
        }
        in.close();
    }
}