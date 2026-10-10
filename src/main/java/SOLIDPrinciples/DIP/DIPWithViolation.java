package SOLIDPrinciples.DIP;

class WiredKeyboard{
    public void connect(){
        System.out.println("Wired Keyboard connected...");
    }
}

//Violated DIP: Computer is tightly coupled to WiredKeyboard. What if in future need wireless keyboard???
class Computer{
    private WiredKeyboard keyboard = new WiredKeyboard();

    public void start(){
        keyboard.connect();
    }
}

public class DIPWithViolation {
    static void main() {
        Computer computer = new Computer();
        computer.start();
    }
}
