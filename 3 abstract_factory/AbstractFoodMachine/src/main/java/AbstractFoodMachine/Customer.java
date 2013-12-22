package AbstractFoodMachine;

import AbstractFoodMachine.factories.FactoryMaker;
import AbstractFoodMachine.factories.FoodFactory;
import AbstractFoodMachine.model.Food;

import java.util.Scanner;

/**
 * This example shows how to use the abstract factory pattern.
 * The customer interacts with an abstract class/interface to access the factory he wants.
 * The interface defines the expected behaviour of the implementing factories.
 *
 * Inside each of the factories there is an implementation of the "factory method" pattern
 * which will allow the creation of the required object.
 *
 * As you see Customer(the client) does not know at all how the objects are created.
 */
public class Customer {

    public void orderFood() {
        System.out.println("Which type of food would you like?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- Mexican");
        System.out.println("2- Chinese");
        System.out.println("3- Indian");
        int option =  scanner.nextInt();

        FoodFactory factory = FactoryMaker.getFactory(option);
        Food food = factory.prepareFood();
        System.out.print("Here are your " + food.getClass().getName());
    }
}
