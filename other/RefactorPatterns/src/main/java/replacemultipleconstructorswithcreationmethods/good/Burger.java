package replacemultipleconstructorswithcreationmethods.good;

/*
 *Replace multiple constructors with creation methods
 *
 * Many constructors on a class make it hard to decide which constructor to call during development
 * Replace the constructors with intention-revealing Creation Methods that return object instances
 *
 *
 *Communication:
 *Copious constructors don’t communicate available types  very well – communicate type
 *availability clearly by offering access to instances via intention- revealing Creation Methods
 *Simplicity:
 * Figuring out which constructor to call isn't simple – make it simple by offering up the various types
 *through intention-revealing Creation Methods.
 */
public class Burger {
    private String meatType;
    private String cookTime;
    private boolean cheese;

    private Burger(String meatType,boolean cheese,String cookTime) {
        this.meatType = meatType;
        this.cheese = cheese;
        this.cookTime = cookTime;
    }

    public Burger getAWeldoneCheeseBurger() {
        return new Burger("beef",true,"weldone");
    }

    public Burger getANonTooCookedBurgerBurgerWithoutCheese() {
        return new Burger("beef",false,"almost raw");
    }
}
