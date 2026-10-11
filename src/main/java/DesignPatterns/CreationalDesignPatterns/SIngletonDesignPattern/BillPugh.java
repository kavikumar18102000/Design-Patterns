package DesignPatterns.CreationalDesignPatterns.SIngletonDesignPattern;

class BPSingleton{
    private BPSingleton(){
        System.out.println("BPSingleton init...");
    }

    //loads only when getInstance() is called. Thread safe by default
    private static class SingletonHelper{
        private static final BPSingleton INSTANCE = new BPSingleton();
    }

    public static BPSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}

public class BillPugh {
    static void main() {
        BPSingleton obj1 = BPSingleton.getInstance();
        BPSingleton obj2 = BPSingleton.getInstance();

        System.out.println("Are both instance same? "+(obj1 == obj2));
    }
}
