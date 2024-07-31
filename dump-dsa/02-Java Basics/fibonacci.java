import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int N = in.nextInt();
        for(int i = 0;i<=N;i++){
            int temp=num2;
            num2 = num1 + num2;
            num1 = temp;
            System.out.println(num1 + num2);
        }
        in.close();
    }
}
