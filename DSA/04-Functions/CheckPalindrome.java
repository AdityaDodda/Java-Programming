import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(Palindrome(num)){
            System.out.println(num + " is a palindrome.");
        }else{
            System.out.println(num + " is not a palindrome.");
        }
        in.close();
    }
 
    // Even this part of code understand and implement again
    static boolean Palindrome(int number){
            String numStr = String.valueOf(number);
            int left = 0;
            int right = numStr.length() - 1;
            while (left < right) {
                if (numStr.charAt(left) != numStr.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
    }
}
