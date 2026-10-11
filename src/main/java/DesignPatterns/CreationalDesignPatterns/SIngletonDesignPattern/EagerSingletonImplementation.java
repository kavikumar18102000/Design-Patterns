package DesignPatterns.CreationalDesignPatterns.SIngletonDesignPattern;

/*
1. Thread-safe by default
2. wastes memory if the instance is never used.*/

class EagerSingleton{
    private static final  EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){
        System.out.println("Eager Singleton init...");
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}

public class EagerSingletonImplementation {
    static void main() {
        EagerSingleton obj1 = EagerSingleton.getInstance();
        EagerSingleton obj2 = EagerSingleton.getInstance();

        System.out.println("Are both instance same? "+(obj1 == obj2));
    }
}


/*even better approach is lazy initialization(BillPugh)*/
