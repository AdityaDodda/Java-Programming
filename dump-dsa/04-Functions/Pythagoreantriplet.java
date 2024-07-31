public class Pythagoreantriplet {
    public static void main(String[] args) {
        trip(3, 4, 5);
    }

    static int trip(int a,int b,int c){
        int triplet = a * a + b * b;
        if(triplet == c*c){
            System.out.println( "(" + a + "," + b + "," + c + ")"  + " is a pythogorean triplet.");
        }else{
            System.out.println( "(" + a + "," + b + "," + c + ")"  + " is not a pythogorean triplet.");
        }
        return triplet;
    }
}
