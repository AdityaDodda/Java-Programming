public class constructors {
    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated(created)
    Human human1 = new Human("Aditya",20,70);
    Human human2 = new Human("Ram",34,56);
    System.out.println(human1.name);
    System.out.println(human2.name);

    human2.eat();
    human1.drink();
    }
}

class Human{
    String name;
    int age;
    double weight;
    Human(String name,int age,double weight){
        this.name = name; //for accessing object attributes within the class we have to use this keyword
        this.age = age;
        this.weight = weight;
    
    }
    void eat(){
        System.out.println(this.name+" is eating");
    }
    void drink(){
        System.out.println(this.name+" is drinking *burp*");
    }
}


