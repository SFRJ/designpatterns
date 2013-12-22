package PizzaKata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 13:31
 * To change this template use File | Settings | File Templates.
 */
public class PizzaSpecification {


    /**
     * This Kata aims to present an scenario where the Template method design pattern can be applied
     * - Every pizza has a base, tomato, cheese and oregano
     * - Pizzas can have meat
     * - Pizzas can have vegetables
     * - Pizzas can have both meat and vegetables
     * - Pizzas don't need to have meat or vegetables
     * - Pizzas must cook for 20' at 400 degrees
     **/

    private PizzaMaker maker;


    @Test
    public void prepareAPizzaJustWithTheBasicIngredients() {
        maker = new BasicPizzaMaker();
        Pizza pizza = maker.make();
        assertThat(pizza.isMeat(),is(false));
        assertThat(pizza.isVegetables(),is(false));
        assertThat(pizzaHasBasicIngredients(pizza),is(true));
        assertThat(pizza.isCooked(),is(true));
    }

    @Test
    public void prepareAPizzaWithMeat() {
        maker = new MeatPizzaMaker();
        Pizza pizza = maker.make();
        assertThat(pizza.isMeat(),is(true));
        assertThat(pizza.isVegetables(),is(false));
        assertThat(pizzaHasBasicIngredients(pizza),is(true));
        assertThat(pizza.isCooked(),is(true));
    }

    @Test
    public void prepareAPizzaWithVegetables() {
        maker = new VegetablesPizzaMaker();
        Pizza pizza = maker.make();
        assertThat(pizza.isMeat(),is(false));
        assertThat(pizza.isVegetables(),is(true));
        assertThat(pizzaHasBasicIngredients(pizza),is(true));
        assertThat(pizza.isCooked(),is(true));
    }

    @Test
    public void prepareAPizzaWithVegetablesAndMeat() {
        maker = new VegetablesAndMeatPizzaMaker();
        Pizza pizza = maker.make();
        assertThat(pizza.isMeat(),is(true));
        assertThat(pizza.isVegetables(),is(true));
        assertThat(pizzaHasBasicIngredients(pizza),is(true));
        assertThat(pizza.isCooked(),is(true));
    }

    @Test
    public void pizzaIsCooked() {
        maker = new VegetablesAndMeatPizzaMaker();
        Pizza pizza = maker.make();
        assertThat(pizza.isCooked(),is(true));
    }

    private boolean pizzaHasBasicIngredients(Pizza margheritta) {
        return margheritta.isBase() && margheritta.isCheese() && margheritta.isTomato() && margheritta.isOregano();
    }
}
