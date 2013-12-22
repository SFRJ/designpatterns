package PizzaKata;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 14:25
 * To change this template use File | Settings | File Templates.
 */
public class VegetablesAndMeatPizzaMaker extends PizzaMaker {
    @Override
    public void addSpecificIngredients(Pizza pizza) {
        pizza.setVegetables(true);
        pizza.setMeat(true);
    }
}
