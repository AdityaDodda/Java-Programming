import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        checkeven();
    }

    static void checkeven(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is a even number.");
        }else{
            System.out.println(num + " is a odd number.");
        }
        in.close();
    }
}
