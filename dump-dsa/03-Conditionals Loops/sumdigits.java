import java.util.Scanner;
public class sumdigits {
    public static void main(String[] args) {
        int n = 567;
        System.out.println(sumd(n));
    }
        static int sumd(int n){
           int sum = 0;
           while(n!=0){
               sum = sum + n % 10;
               n = n/10;
           }
           return sum;
        }
        
    
}
