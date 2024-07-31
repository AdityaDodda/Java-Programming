import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rupees = in.nextInt();
        int dollars = rupees/80;
        System.out.println(dollars);
        in.close();
    }
}
