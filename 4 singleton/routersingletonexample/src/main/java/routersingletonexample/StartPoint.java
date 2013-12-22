package routersingletonexample;

/**
 * This example tries to prove how Singleton pattern can be used to provide a unique instance of a class
 * that is thread safe.
 * There is a lot of controversy around the singleton design pattern, the reason for this is that it encourages
 * to use global static fields, so it is not a very object oriented approach.
 * Many would recommend not to use this pattern at all and it is rare to have an scenario where you can use it.
 * But if you need to use it, make sure you ensure that it is thread safe.
 * This example was created following the guidelines at:
 * http://sourcemaking.com/design_patterns/singleton/java/1
 *
 * In the rare cases where the Singleton is used, it can be combined with other creational designe patterns such as:
 * prototype,builder or abstract factory.
 */
public class StartPoint {
    public static void main(String [] args) {
        RouterUser clientA = new RouterUser("hey how is it going","123.456.789");
        RouterUser clientB = new RouterUser("It is rainy today","223.786.733");
        RouterUser clientC = new RouterUser("I've got your money","777.564.111");

        Thread threadA = new Thread(clientA);
        threadA.setName("Mr Brown");
        threadA.start();

        Thread threadB = new Thread(clientA);
        threadB.setName("Gillian");
        threadB.start();

        Thread threadC = new Thread(clientA);
        threadC.setName("The boss");
        threadC.start();
    }
}
