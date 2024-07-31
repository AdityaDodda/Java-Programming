public class objects {
    public static void main(String[] args) {
        // objects = an instance of a class that may contain attributes and methods
        // example: (phone,desk,computer,coffee cup)

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.model);
        System.out.println(myCar1.make);
        System.out.println(myCar2.model);
        myCar1.drive();
        myCar1.brake();
    }
}

class Car{
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    void drive(){
        System.out.println("You drive the car");
    }
    void brake(){
        System.out.println("You step on the brakes");
    }
}
