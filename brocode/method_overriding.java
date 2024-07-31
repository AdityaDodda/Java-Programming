public class method_overriding{
    public static void main(String[] args) {
        
        // method overriding = Declaring a method in sub class,which is already present in parent class.
        // done so that a child class can give its own implementation
        Animal animal = new Animal();
        Animal dog = new Dog();
        dog.speak();
        animal.speak();
    }
}

class Animal{
    void speak(){
        System.out.println("The animal speaks");
    }
}

class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("The dog does *bark*");
    }
}