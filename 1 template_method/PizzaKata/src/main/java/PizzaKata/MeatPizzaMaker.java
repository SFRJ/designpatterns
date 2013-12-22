package PizzaKata;

public class MeatPizzaMaker extends PizzaMaker {
    @Override
    public void addSpecificIngredients(Pizza pizza) {
        pizza.setMeat(true);
        pizza.setVegetables(false);
    }
}
