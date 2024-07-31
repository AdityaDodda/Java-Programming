import java.util.Scanner;
public class sumN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 1;
        int b = 2;
        for(int i=0;i<=num;i++){
            int temp = b;
            a = a+b;
            System.out.println(a);
            b = temp + 1;
        }
        in.close();
    }
}
