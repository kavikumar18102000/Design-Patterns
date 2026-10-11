package DesignPatterns.CreationalDesignPatterns.SIngletonDesignPattern;

class EFTSingleton{
    private static volatile EFTSingleton instance; //volatile keyword ensures visibility

    private EFTSingleton() {
        System.out.println("EFTSingleton init....");
    }

    public static EFTSingleton getInstance() {
        EFTSingleton localInstance = instance;
        if(localInstance == null) {//First check (NO Lock)
            synchronized (EFTSingleton.class) {//Thread safety
                if(localInstance == null) {//second check (Inside Lock)
                    localInstance = new EFTSingleton();
                }
                instance = localInstance;
            }
        }
        return localInstance;
    }
}

public class EfficientThreadSafeSingletonImplementation {
    static void main() {
        Runnable task = ()->{
            EFTSingleton instance = EFTSingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" -> "+instance.hashCode());
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }
}

/*we can make even better singleton approach than this(Eager Initialization)*/