package replacemultipleconstructorswithcreationmethods.bad;

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

    public Burger() {
         this.meatType = "beef";
        this.cheese = true;
        this.cookTime = "welldone";
    }

    public Burger(String meatType,boolean cheese,String cookTime) {
        this.meatType = meatType;
        this.cheese = cheese;
        this.cookTime = cookTime;
    }




}
