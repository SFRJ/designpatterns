package PizzaKata;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 14:16
 * To change this template use File | Settings | File Templates.
 */
public class BasicPizzaMaker extends PizzaMaker {
    @Override
    public void addSpecificIngredients(Pizza pizza) {
        pizza.setMeat(false);
        pizza.setVegetables(false);
    }
}
