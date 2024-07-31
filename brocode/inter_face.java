public class inter_face {
    public static void main(String[] args){
       //interface = a template that can be applied to a class.
       //            similiar to inheritance, but specifies what a class has/must do.
       //            classes can apply more than one interface, inheritance is limited to 1 super class

       Rabbit rabbit = new Rabbit();
       rabbit.flee();

       Hawk hawk = new Hawk();
       hawk.hunt();

       Fish fish = new Fish();
       fish.flee();
       fish.hunt();
    }
}

class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("The rabit is fleeing");
    }
}

class Hawk implements Predator{
      @Override
      public void hunt(){
        System.out.println("The hawk is hunting");
      }

}

class Fish implements Prey,Predator{
    @Override
    public void hunt(){
       System.out.println("This fish is hunting smaller fish");
    }
    public void flee(){
        System.out.println("This fish is fleeing from bigger fish");
    }

}

interface Prey{
    void flee();
}

interface Predator{
    void hunt();
}


