package SOLIDPrinciples.DIP;

interface Keyboard{
    void connect();
}

class DIPWiredKeyboard implements Keyboard{

    @Override
    public void connect() {
        System.out.println("WiredKeyboard connected....");
    }
}

class WirelessKeyboard implements Keyboard{
    @Override
    public void connect() {
        System.out.println("WirelessKeyboard connected....");
    }
}

class DIPComputer{
    private Keyboard keyboard;

    public  DIPComputer(Keyboard keyboard){
        this.keyboard = keyboard;
    }

    void start(){
        keyboard.connect();
    }
}

public class DIPWithoutViolation {
    static void main() {
        DIPComputer pc1 = new DIPComputer(new WirelessKeyboard());
        pc1.start();

        DIPComputer pc2 = new DIPComputer(new DIPWiredKeyboard());
        pc2.start();
    }
}
