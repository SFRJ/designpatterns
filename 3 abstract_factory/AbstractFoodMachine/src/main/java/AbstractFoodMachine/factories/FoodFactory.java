package AbstractFoodMachine.factories;

import AbstractFoodMachine.model.Food;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
public interface FoodFactory {
    public Food prepareFood();
}
