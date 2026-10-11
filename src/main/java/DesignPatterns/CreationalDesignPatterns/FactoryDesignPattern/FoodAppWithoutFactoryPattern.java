package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern;

//Product Interface
interface Food{
    String prepare();
}

//Concrete Products
class Pizza implements Food{
    @Override
    public String prepare() {
        return "Preparing Pizza...";
    }
}

class Burger implements Food{
    @Override
    public String prepare() {
        return "Preparing Burger...";
    }
}

//client code - tightly coupled
public class FoodAppWithoutFactoryPattern {
    static void main() {
        String order = "pizza";
        Food food;

        //modifying code in client side if new food needs to be added.
        if (order == "pizza"){
            food = new Pizza();
        }
        else if (order == "burger"){
            food = new Burger();
        }
        else{
            throw new IllegalArgumentException("Invalid order");
        }

        System.out.println(food.prepare());
    }
}

/*Problems:
1. Restaurant calls is doing creation (not its job)
2. Adding new food (Pasta) needs modifying this code. Violates OCP
3. Code is harder to test and extend
*/
