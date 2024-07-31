public class methods {
    public static void main(String[] args){
        // method = a block of code that is executed whenever it is called upon
        /* String name = "Aditya";
        int age = 21;
        hello(name,age); // we can't declare a non-static method inside of a static method */

        int x = 3;
        int y = 4;
        int z = add(x, y);
        System.out.println(z);
    }

    /* static void hello(String title,int age){ // void is a return type,we can give any arg name it will still execute the same operation
        System.out.println("Hello "+title);
        System.out.println("You are "+age ); */

        static int add(int x,int y){
            // int z = x + y;
            // return z; 
            return x+y;
        } 
}

