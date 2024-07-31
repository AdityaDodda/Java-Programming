import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        /* ArrayList = a resizable array.
         *             Elements can be added and removed after compilation phase
         *             store reference data types
         */
    ArrayList<String> food = new ArrayList<String>();
    food.add("pizza");
    food.add("burger");
    food.add("hotdog");

    food.set(0, "sushi");
    food.remove(2);
    food.clear();

// in Arrays we use length but in ArrayList we use size
    for(int i=0;i<food.size();i++){
        System.out.println(food.get(i));
        }
    }
}
