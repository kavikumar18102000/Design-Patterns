package SOLIDPrinciples.ISP;

//Violates ISP: Robot is forced to implement eat() even though it doesn't need it.

interface Worker{
    void work();
    void eat();
}

class Human implements Worker{
    @Override
    public void work() {
        System.out.println("Human working....");
    }

    @Override
    public void eat() {
        System.out.println("Human eating....");
    }
}

class Robot implements Worker{

    @Override
    public void work() {
        System.out.println("Robot working....");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot cannot eat...");
    }
}

public class ISPWithViolation {
    static void main() {
        Human human = new Human();
        human.eat();
        Robot robot = new Robot();
        robot.eat();

    }
}
