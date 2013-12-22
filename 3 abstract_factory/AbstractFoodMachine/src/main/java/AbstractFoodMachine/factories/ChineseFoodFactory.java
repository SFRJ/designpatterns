package AbstractFoodMachine.factories;

import AbstractFoodMachine.model.Food;
import AbstractFoodMachine.model.chinese.ChineseFood;
import AbstractFoodMachine.model.chinese.DuckPeking;
import AbstractFoodMachine.model.chinese.Rice;
import AbstractFoodMachine.model.chinese.SpringRoll;

import java.util.Scanner;

/**
 * Here an example of the factory method pattern.
 * The method is responsible for hiding the way on which objects are created from the client.
 * Depending on the parameter one object or another will be created
 */
public class ChineseFoodFactory implements FoodFactory {
    @Override
    public ChineseFood prepareFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chinese food menu:");
        System.out.println("1- Spring rolls");
        System.out.println("2- Rice 3 wonders");
        System.out.println("3- Duck Peking style");

        return getFood(scanner.nextInt());
    }

    private ChineseFood getFood(int choice) {
        switch (choice) {
            case 1:
                return new SpringRoll();
            case 2:
                return new Rice();
            case 3:
                return new DuckPeking();
        }
        return null;
    }
}
