package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern;

class Pasta implements Food{

    @Override
    public String prepare() {
        return "preparing pasta....";
    }
}

class Maggie implements Food{
    @Override
    public String prepare() {
        return "preparing maggie....";
    }
}

//Factory class
abstract class Factory{
    abstract Food createFood();
}

class PastaFactory extends Factory{
    @Override
    public Food createFood() {
        return new Pasta();
    }
}

class MaggieFactory extends Factory{
    @Override
    public Food createFood() {
        return new Maggie();
    }
}

public class FullFactoryPattern {
    static void main() {
        Factory factory = new MaggieFactory();
        System.out.println(factory.createFood().prepare());
    }
}
