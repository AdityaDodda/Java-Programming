public class poly_morphism {
    public static void main(String[] args) {
        //polymorphism = greek word for poly-"many",morph-"form"
        //               The ability of an object to identify as more than one type
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat}; // Like this similarily we can store the similiar boat in boat only but not others so we use polymorphism
        
        for(Vehicle x:racers){
            x.go();
        }

    }
}

class Vehicle{
    public void go(){
    }    
}

class Car extends Vehicle{
    public void go(){
        System.out.println("The car begins moving");
    }
}

class Bicycle extends Vehicle{
      public void go(){
        System.out.println("The bicycle begins moving");
    }
}

class Boat extends Vehicle{
       public void go(){
        System.out.println("The boat begins moving");
    }
}
