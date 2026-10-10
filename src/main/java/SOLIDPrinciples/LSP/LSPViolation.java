package SOLIDPrinciples.LSP;

//Violates LSP: Penguin cannot fly, but it inherits fly() from super class.

class Bird{
    public void fly(){
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird{
    @Override
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird{
    @Override
    public void fly(){
        throw new UnsupportedOperationException("Penguin cannot fly...");
    }
}

public class LSPViolation {
    static void main() {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        Penguin penguin = new Penguin();
        penguin.fly();
    }
}
