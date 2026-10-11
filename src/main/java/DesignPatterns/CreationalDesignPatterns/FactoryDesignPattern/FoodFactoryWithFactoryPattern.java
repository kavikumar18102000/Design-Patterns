package DesignPatterns.CreationalDesignPatterns.FactoryDesignPattern;

//Product Interface
interface FFFood{
    String prepare();
}

//Concrete Products
class FFPizza implements FFFood{
    @Override
    public String prepare() {
        return "Preparing Pizza...";
    }
}

class FFBurger implements FFFood{
    @Override
    public String prepare() {
        return "Preparing Burger...";
    }
}

//Factory class
class FoodFactory{
    public static FFFood getFood(String order){
        //still this code is violating OCP
        if(order.equals("burger")){
            return new FFBurger();
        }
        else if(order.equals("pizza")){
            return new FFPizza();
        }
        else{
            throw new IllegalArgumentException("Invalid order");
        }
    }
}

public class FoodFactoryWithFactoryPattern {
    static void main() {
        String order = "pizza";
        FFFood food = FoodFactory.getFood(order);
        System.out.println(food.prepare());
    }
}

/*Improvements
1. Client(Restaurant) no longer creates objects
2. Centralized creation logic
3. Sill violates OCP - factory must be modified to create a new food*/
