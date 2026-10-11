package DesignPatterns.CreationalDesignPatterns.SIngletonDesignPattern;

//most straight forward Singleton pattern.

enum ENUMSingleton{
    INSTANCE;

    public void show(){
        System.out.println("Enum singleton");
    }
}

public class EnumSingleton {
    static void main() {
        ENUMSingleton.INSTANCE.show();
    }
}
