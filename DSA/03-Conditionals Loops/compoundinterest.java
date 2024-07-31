import java.util.Scanner;
import java.lang.Math;
public class compoundinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double principal = in.nextDouble();
        int time = in.nextInt();
        int rate = in.nextInt();
        int n = in.nextInt();
        double amount = (principal)*Math.pow((1+(rate/n)),n*time);
        System.out.println(amount);
        double ci = amount - principal;
        System.out.println(ci);
        in.close();
    }
}