package DesignPatterns.CreationalDesignPatterns.SIngletonDesignPattern;

class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("ThreadSageSingleton init....");
    }

    //making this method accessible one at a time in multithreaded environment
    public static synchronized ThreadSafeSingleton getInstance(){
        if (instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

public class ThreadSafeSingletonImplementation {
    static void main() {
        Thread thread1 = new Thread(()->{
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() +" -> "+instance.hashCode());
        }, "Thread-1");

        Thread thread2 = new Thread(()->{
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() +" -> "+instance.hashCode());
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}

/*Issue with this approach
1. if we have n number of threads, each thread has to wait till the lock is released*/
