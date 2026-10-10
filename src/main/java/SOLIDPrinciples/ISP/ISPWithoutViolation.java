package SOLIDPrinciples.ISP;

interface worker{
    void work();
}

interface Eatable{
    void eat();
}

class ISPHuman implements worker, Eatable{
    @Override
    public void eat() {
        System.out.println("Human eating....");
    }

    @Override
    public void work() {
        System.out.println("Human working....");
    }
}

class ISPRobot implements worker{
    @Override
    public void work() {
        System.out.println("Robot working....");
    }
}



public class ISPWithoutViolation {
    static void main() {
        ISPHuman human = new ISPHuman();
        human.eat();
        ISPRobot robot = new ISPRobot();
        robot.work();
    }
}
