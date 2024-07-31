public class Maxmin {
    public static void main(String[] args) {
      System.out.println(max(45, 50, 55));
      System.out.println(min(45, 50, 55));
    }
  
    static int max(int a, int b, int c) {
      int maximum = a;
      if (b > maximum) {
        maximum = b;
      }
      if (c > maximum) {
        maximum = c;
      }
      return maximum;
    }
  
    static int min(int a, int b, int c) {
      int minimum = a;
      if (b < minimum) {
        minimum = b;
      }
      if (c < minimum) {
        minimum = c;
      }
      return minimum;
    }
  }