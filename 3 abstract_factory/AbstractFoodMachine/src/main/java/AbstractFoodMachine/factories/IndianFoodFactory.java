package AbstractFoodMachine.factories;

import AbstractFoodMachine.model.Food;
import AbstractFoodMachine.model.chinese.ChineseFood;
import AbstractFoodMachine.model.chinese.DuckPeking;
import AbstractFoodMachine.model.chinese.Rice;
import AbstractFoodMachine.model.chinese.SpringRoll;
import AbstractFoodMachine.model.indian.Bryani;
import AbstractFoodMachine.model.indian.ChickenTika;
import AbstractFoodMachine.model.indian.IndianFood;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
/**
 * Here an example of the factory method pattern.
 * The method is responsible for hiding the way on which objects are created from the client.
 * Depending on the parameter one object or another will be created
 */
public class IndianFoodFactory implements FoodFactory {
    @Override
    public IndianFood prepareFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indian food menu:");
        System.out.println("1- Bryani");
        System.out.println("2- Chicken Tika");

        return getFood(scanner.nextInt());
    }

    private IndianFood getFood(int choice) {
        switch (choice) {
            case 1:
                return new Bryani();
            case 2:
                return new ChickenTika();
        }
        return null;
    }
}
