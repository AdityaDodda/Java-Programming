import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int pow = in.nextInt();
        int result = 1;
        for(int i=1;i<=pow;i++){
           result = result*num;
        }
        System.out.println(result);
        in.close();
    }
}
