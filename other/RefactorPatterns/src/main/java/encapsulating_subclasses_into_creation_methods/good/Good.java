package encapsulating_subclasses_into_creation_methods.good;

/*
 *Communication:
 *If it is important that client code talk with subclass instances via a common interface, it is important
 *to communicate this in your code. Creating subclasses doesn't communicate this very well.
 *Instead, create protected subclass constructors and Creation Methods that give clients access to the various
 *subclass types.
 *
 * Simplicity:
 * Figuring out which subclass to instantiate and how to instantiate it isn't as simple as calling
 *intention-revealing Creation Methods, particularly when you have several subclasses and numerous ways
 *to instantiate them. It is simpler if clients don’t have to know about subclasses,but can instead obtain
 *instances from superclass Creation Methods.
 */
public class Good {

    public Good getSomethingCool() {
        return new Cool();
    }
    public Good getSomethingGreat() {
        return new Great();
    }
}
