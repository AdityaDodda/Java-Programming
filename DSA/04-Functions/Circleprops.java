import java.util.Scanner;

public class Circleprops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rad = in.nextDouble();
        System.out.println(circum(rad));
        System.out.println(area(rad));
        in.close();
    }

    static double circum(double rad1){
        double circum = 2 * 3.14 * rad1;
        return circum;
    }

    static double area(double rad2){
        double area = 3.14 * rad2 * rad2;
        return area;
    }
}