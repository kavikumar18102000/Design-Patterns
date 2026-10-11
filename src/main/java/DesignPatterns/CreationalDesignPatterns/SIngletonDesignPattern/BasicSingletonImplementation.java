package DesignPatterns.CreationalDesignPatterns.SIngletonDesignPattern;

class Singleton{
    //Declare static variable
    private static Singleton instance;

    //make constructor private
    private Singleton(){
        System.out.println("Singleton Instance created...");
    }

    //public static method to get an instance
    public static Singleton getInstance(){
        if (instance == null){ //create instance only if it doesn't exist
            instance = new Singleton();
        }
        return instance;
    }
}


public class BasicSingletonImplementation {
    static void main() {
        /*Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();*/

        Runnable task = ()->{
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" -> "+instance.hashCode());
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(()->{
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" -> "+instance.hashCode());
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}

/*Issues with this approach
1. Not-thread safe: multiple threads can create multiple instance
*/
