import java.util.Scanner;
public class SumNatural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println(sum(num1));
        in.close();
    }

    static int sum(int num){
        int sumn = (num * (num + 1))/2;
        return sumn;
    }
}