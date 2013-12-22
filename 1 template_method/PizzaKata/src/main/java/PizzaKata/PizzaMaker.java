package PizzaKata;

public abstract class PizzaMaker {

    //This is a template method the subclasses are responsible to provide implementation for some parts of it.
    public Pizza make() {
        Pizza pizza = addBasicIngredients();
        addSpecificIngredients(pizza);
        cookPizza(pizza);
        return pizza;
    }


    public abstract void addSpecificIngredients(Pizza pizza);

    private Pizza addBasicIngredients() {
        Pizza pizza = new Pizza();
        pizza.setBase(true);
        pizza.setCheese(true);
        pizza.setOregano(true);
        pizza.setTomato(true);
        return pizza;
    }
    private void cookPizza(Pizza pizza) {
        pizza.setCooked(true);
    }
}
