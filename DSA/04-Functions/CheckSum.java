import java.util.Scanner;
public class CheckSum {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        System.out.println(sum);
        in.close();
    }
}
