import java.io.*;
import java.util.Scanner;
import java.math.*;
class armstrong {
	static void findArmstrong(int num1, int num2){
		for (int i = num1 + 1; i < num2; ++i) {
			int x = i;
			int n = 0;
			while (x != 0) {
				x /= 10;
				++n;
			}
			int pow_sum = 0;
			x = i;
			while (x != 0) {
				int digit = x % 10;
				pow_sum += Math.pow(digit, n);
				x /= 10;
			}
	        if (pow_sum == i)
			    System.out.print(i + " ");
		}
	}
	public static void main(String args[]){
        Scanner in = new Scanner(System.in);
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		findArmstrong(num3, num4);
        in.close();
	}
}