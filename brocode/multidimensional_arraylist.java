import java.util.*;
public class multidimensional_arraylist {
    public static void main(String[] args) {
        
        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("coffee");
        drinksList.add("soda");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList);
        System.out.print(groceryList.get(2).get(1));


        
    }
}
