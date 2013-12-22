package AbstractFoodMachine.factories;

import AbstractFoodMachine.factories.ChineseFoodFactory;
import AbstractFoodMachine.factories.FoodFactory;
import AbstractFoodMachine.factories.IndianFoodFactory;
import AbstractFoodMachine.factories.MexicanFoodFactory;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 20:50
 * To change this template use File | Settings | File Templates.
 */
public class FactoryMaker {
   public static FoodFactory getFactory(int choice) {
        switch (choice) {
            case 1:
                return new MexicanFoodFactory();
            case 2:
                return new ChineseFoodFactory();
            case 3:
                return new IndianFoodFactory();
        }
        return null;
    }

}