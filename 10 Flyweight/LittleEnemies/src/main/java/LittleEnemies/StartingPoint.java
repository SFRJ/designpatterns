package LittleEnemies;


import java.awt.*;

/**
 * Intent

 The intent of this pattern is to use sharing to support a large number of objects that have part of their internal
 state in common where the other part of state can vary.

 Real life examples:
 - Games with graphics(Such as arkacoin)
 - Text Editors as discussed in the Text Editors example.

 From the point of view of the flyweight pattern, every object has 2 types of data:
    - Intrensic: Data that has in comon with other objects and can be reused
    - Extrensic: Data that is not in comon with other objects and should not be shared

 Our goal is to reuse data so less resources from the system are used.
 The steps to implement this pattern are:

 1- Ensure that object overhead is an issue needing attention, and, the client
 of the class is able and willing to absorb responsibility realignment.

 2- Divide the target class’s state into: shareable (intrinsic) state, and non-shareable (extrinsic) state.

 3- Remove the non-shareable state from the class attributes, and add it the calling argument list of affected methods.

 4- Create a Factory that can cache and reuse existing class instances.

 5- The client must use the Factory instead of the new operator to request objects.

 6- The client (or a third party) must look-up or compute the non-shareable state,
    and supply that state to class methods.


 */

public class StartingPoint {

    public static void main(String [] args) {
        //This is a flyweight factory.
        //If an object with the attribute color = "Red" already exists, it will be returned,
        //otherwise it will be created, added to the pool and then returned.
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy enemyA = enemyFactory.getEnemy("Red");
        Enemy enemyB = enemyFactory.getEnemy("Red");
        //Triggering some action with extrensic data
        enemyA.draw(new Point(40,65));
        enemyB.draw(new Point(100,67));
    }
}
