import java.util.Random;

public class variable_scope {
    public static void main(String[] args) {
        // local = declared inside a method
        // visible only to that method
        // global = declared outside a method, but within a class
        // visible to all parts of a class

        // DiceRoller diceRoller = new DiceRoller();
    }
}

class DiceRoller {
    DiceRoller() {
        Random random = new Random();
        int number = roll(random);
        System.out.println(number);
    }

    int roll(Random random) {
        int number = random.nextInt(6) + 1;
        return number;
    }
}
