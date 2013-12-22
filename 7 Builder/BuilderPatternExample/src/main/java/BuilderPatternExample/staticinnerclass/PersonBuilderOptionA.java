package BuilderPatternExample.staticinnerclass;

/**
 * With the GenerateStaticBuilder plugin you can automatically create inner builder classes:
 * http://plugins.jetbrains.com/plugin/?id=6004
 */

public class PersonBuilderOptionA {

    private  String name;
    private int age;

    public static class PersonBuilder
    {
        private PersonBuilderOptionA person;

        private PersonBuilder()
        {
            person = new PersonBuilderOptionA();
        }

        public PersonBuilder withName(String name)
        {
            person.name = name;
            return this;
        }

        public PersonBuilder withAge(int age)
        {
            person.age = age;
            return this;
        }

        public static PersonBuilder person()
        {
            return new PersonBuilder();
        }

        public PersonBuilderOptionA build()
        {
            return person;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
