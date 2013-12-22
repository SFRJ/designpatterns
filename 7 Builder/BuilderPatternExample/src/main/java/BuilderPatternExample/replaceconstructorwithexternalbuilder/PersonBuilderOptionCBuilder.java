package BuilderPatternExample.replaceconstructorwithexternalbuilder;

public class PersonBuilderOptionCBuilder {
    private String name;
    private int age;

    public PersonBuilderOptionCBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilderOptionCBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilderOptionC createPersonBuilderOptionC() {
        return new PersonBuilderOptionC(name, age);
    }
}