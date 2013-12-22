package AbstractFoodMachine.factories;

import AbstractFoodMachine.model.Food;
import AbstractFoodMachine.model.chinese.ChineseFood;
import AbstractFoodMachine.model.chinese.DuckPeking;
import AbstractFoodMachine.model.chinese.Rice;
import AbstractFoodMachine.model.chinese.SpringRoll;
import AbstractFoodMachine.model.mexican.Fajitas;
import AbstractFoodMachine.model.mexican.MexicanFood;
import AbstractFoodMachine.model.mexican.Tacos;

import java.util.Scanner;

/**
 * Here an example of the factory method pattern.
 * The method is responsible for hiding the way on which objects are created from the client.
 * Depending on the parameter one object or another will be created
 */
public class MexicanFoodFactory implements FoodFactory {
    @Override
    public MexicanFood prepareFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mexican food menu:");
        System.out.println("1- Fajitas");
        System.out.println("2- Tacos");

        return getFood(scanner.nextInt());
    }

    private MexicanFood getFood(int choice) {
        switch (choice) {
            case 1:
                return new Fajitas();
            case 2:
                return new Tacos();
        }
        return null;
    }
}
