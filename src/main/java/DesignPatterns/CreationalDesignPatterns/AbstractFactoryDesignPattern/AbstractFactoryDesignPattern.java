package DesignPatterns.CreationalDesignPatterns.AbstractFactoryDesignPattern;

interface AFDFood{
    void prepareFood();
}

interface AFDSideFood{
    void prepareSideFood();
}

class AFDBurger implements AFDFood{
    @Override
    public void prepareFood() {
        System.out.println("Preparing burger food");
    }
}

class AFDPasta implements AFDFood{
    @Override
    public void prepareFood() {
        System.out.println("Preparing pasta food");
    }
}

class BurgerSideFood implements AFDSideFood{
    @Override
    public void prepareSideFood() {
        System.out.println("preparing burger side food");
    }
}

class PastaSideFood implements AFDSideFood{
    @Override
    public void prepareSideFood() {
        System.out.println("preparing pasta side food");
    }
}

abstract class AbstractFactory{
    abstract AFDFood createMainFood();
    abstract AFDSideFood createSideFood();
}

class BurgerMealFactory extends AbstractFactory{
    @Override
    public AFDFood createMainFood() {
        return new AFDBurger();
    }

    @Override
    AFDSideFood createSideFood() {
        return new BurgerSideFood();
    }
}

class PastaMealFactory extends AbstractFactory{
    @Override
    public AFDFood createMainFood() {
        return new AFDPasta();
    }

    @Override
    AFDSideFood createSideFood() {
        return new PastaSideFood();
    }
}

public class AbstractFactoryDesignPattern {
    static void main() {
        AbstractFactory pastaMealFactory = new PastaMealFactory();
        pastaMealFactory.createMainFood().prepareFood();
        pastaMealFactory.createSideFood().prepareSideFood();
    }
}
