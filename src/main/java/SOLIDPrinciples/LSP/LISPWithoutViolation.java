package SOLIDPrinciples.LSP;

abstract class LSPBird{
    abstract void makeSound();
}

interface FlyingBird{
    void fly();
}

class SparrowBird extends LSPBird implements FlyingBird{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void makeSound() {
        System.out.println("chhhhhh......");
    }
}

class PenguinBird extends LSPBird{

    @Override
    void makeSound() {
        System.out.println("aaaaaa.........");
    }
}

public class LISPWithoutViolation {
    static void main() {
        SparrowBird sparrowBird = new SparrowBird();
        sparrowBird.fly();
        PenguinBird penguinBird = new PenguinBird();
        penguinBird.makeSound();
    }
}
