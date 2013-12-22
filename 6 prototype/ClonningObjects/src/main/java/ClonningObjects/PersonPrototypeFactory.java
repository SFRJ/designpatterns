package ClonningObjects;

/**
 * It is a common practice to use a factory to create the clones.
 * In this example we are not using a parameter but we could if the model was big and complex or maybe we didn't know
 * the type of the object needed until runtime.
 * (See abstract factory pattern).
 */
public class PersonPrototypeFactory {

    //Many times the blueprint to clone is partially initialised so doesn't have to be done again and
    //again for those fields that we know that are going to have the same value regardless the object.
    private Person cloneBluePrint = new Person("Djordje");

    public PrototypeCapable getAPersonPrototype() throws CloneNotSupportedException {
        return  cloneBluePrint.clone();
    }

    public Person getCloneBluePrint() {
        return cloneBluePrint;
    }
}
