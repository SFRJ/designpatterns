package BuilderPatternExample.staticinnerclass;

/**
 * This is another approach to builder pattern using static inner class.
 * Note that the returned person is Immutable
 * http://plugins.jetbrains.com/plugin/?id=6004
 */

public class PersonBuilderOptionB {

    private final String name;
    private final int age;

    private PersonBuilderOptionB(PersonBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
    }

    public static class PersonBuilder {
        private  String name;
        private int age;

        public PersonBuilder() {
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilderOptionB build() {
            return new PersonBuilderOptionB(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}