import java.lang.Math;
import java.util.Scanner;
public class distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("First point coordinates are "+ "(" + x1 + "," + y1 + ")");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("First point coordinates are "+ "(" + x2 + "," + y2 + ")");
        double distance = Math.sqrt((x2*x2 - x1*x1)+(y2*y2 - y1*y1));
        System.out.println(distance);
        in.close();
    }
}
