/*1st Method By extending thread class
 class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Aditya");
        }
    }
}

class B{
    public static void main(String[] args){
        A t = new A();
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("Ram");
        }
    }
}   

// 2nd Method Runnable Interface
class B{
    public static void main(String[] args) {
        A r = new A();
        Thread t = new Thread(r);
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("Main Thread");
        }
    }
}
    class A implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("My child thread");
        }
    }
} 

// Thread Scheduler
class B{
    public static void main(String[] args) {
        
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class A extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
           System.out.println(n);
        }
    }
} */


 