package constructor_chaining.bad;

/**
 * Constructor chaining
 * <p/>
 * "You have multiple constructors  that contain duplicate code
 * Chain the constructors together to obtain the least duplicate code"
 * <p/>
 * <p/>
 * Communication:
 * When constructors in a class implement duplicate work,the code fails to communicate what
 * is specific from what is general.
 * Communicate this by having specific constructors forward calls to more general-purpose
 * constructors and do unique work in each constructor.
 * <p/>
 * Duplication:
 * Duplicate code in your constructors makes your classes more error-prone and harder to
 * maintain. Find what is common,place it in general-purpose constructors, forward calls to
 * these general constructors and implement what isn’t general in  each constructor.
 * <p/>
 * Simplicity:
 * If more than one constructor contains the same code, it’s
 * harder to see how each constructor is different. Simplify
 * your constructors by making specific ones call more general
 * purpose ones, in a chain.
 */
public class Person {

    private String name;
    private int age;
    private double weight;
    private double height;


    public Person() {
        this.name = "Default";
        this.age = 1;
        this.weight = 1D;
        this.height = 1D;
    }

    public Person(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1D;
        this.height = 1D;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1D;
        this.height = 1D;
    }

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

}
