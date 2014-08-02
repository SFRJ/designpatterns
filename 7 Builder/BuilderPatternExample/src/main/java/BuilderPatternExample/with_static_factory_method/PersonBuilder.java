package BuilderPatternExample.with_static_factory_method;

/*
    Use a builder when an object has too many variables and is difficult to construct.
 */
public class PersonBuilder {

    //1- instantiate the object you want to build
    private Person person = new Person();

    //2- dont allow direct instantiation of the builder
    private PersonBuilder() {
    }

    //3- provide a factory method for the builder
    public static PersonBuilder personBuilder() {
        return new PersonBuilder();
    }

    //4- create update methods
    public PersonBuilder withName(String name) {
        person.setName(name);
        return this;
    }

    //4- create update methods
    public PersonBuilder withAge(int age) {
        person.setAge(age);
        return this;
    }

    //5- have a build method to return the object when it is ready
    public Person build() {
        return person;
    }
}
