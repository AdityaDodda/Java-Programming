import java.util.List;
 import java.util.ArrayList;



    

 public static double subtraction(List<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result -= numbers.get(i);
        }
        return result;
    }

    public static double multiplication(List<Double> numbers) {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }



public class operation {
   


    public static void main(String[] args) {
        // Creating a list of numbers
        List<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(5.0);
        numbers.add(2.0);

        // Using MathOperations methods
        double sum = MathOperations.addition(numbers);
        double difference = MathOperations.subtraction(numbers);
        double product = MathOperations.multiplication(numbers);

        // Displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }

}
