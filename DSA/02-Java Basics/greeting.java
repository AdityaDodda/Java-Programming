import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hi "+name+" how are you!!!");
        in.close();
    }
}
