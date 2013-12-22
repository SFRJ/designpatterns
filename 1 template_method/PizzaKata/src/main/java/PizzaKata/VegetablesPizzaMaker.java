package PizzaKata;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 14:21
 * To change this template use File | Settings | File Templates.
 */
public class VegetablesPizzaMaker extends PizzaMaker {
    @Override
    public void addSpecificIngredients(Pizza pizza) {
        pizza.setMeat(false);
        pizza.setVegetables(true);
    }
}
