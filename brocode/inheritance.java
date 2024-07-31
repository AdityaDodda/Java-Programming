public class inheritance {
    public static void main(String[] args) {
        // inheritance = the process where one class acquires, the attributes and methods of another.
        Car car1 = new Car();
        car1.go();

        Bicycle bike1 = new Bicycle();
        bike1.stop();

        System.out.println(car1.speed);
        System.out.println(bike1.speed);
        System.out.println(bike1.pedals);
        System.out.println(car1.doors);    
    }
}

class Vehicle{
    double speed;

    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle is stopped");
    }
}

class Car extends Vehicle{
    int wheels = 4;
    int doors = 4;
}

class Bicycle extends Vehicle{
    int wheels = 2;
    int pedals = 2;
}