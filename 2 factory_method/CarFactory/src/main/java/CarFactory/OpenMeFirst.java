package CarFactory;

import CarFactory.model.Car;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 15:21
 * To change this template use File | Settings | File Templates.
 */
public class OpenMeFirst {

    /*
    * We create a factory to encapsulate the creation logic of an object,
    * when we don't know the type of object that we need(It is decided at runtime).
    * Also when the client does not need to know about the dependencies of the object being
    * created, the factory is used(In other words, there is a complex way of creating an object).
    * In this example we will use factory because it will be at runtime, when the decision of which object to be
    * create will be made. If car had some dependencies the factory should be able to provide them.
    * */
    public static void main(String[] args) {
        //We will need a car but we don't know of which type yet.
        Car car;
        CarFactory factory = new CarFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me where are you going and I will tell you the car you need:");
        System.out.println("1- Family trip");
        System.out.println("2- Drive by de beach");
        System.out.println("3- To the mountain");
        int option = 0;
        //The car that needs to be created will be determined at runtime.
        option=scanner.nextInt();
        //The factory contains the logic that will determine the Car
        // object that should be created, depending on the parameter
        car = factory.make(option);
        System.out.println("You will need " + car.getClass().getCanonicalName());

    }
}
