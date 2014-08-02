package BuilderPatternExample.with_static_factory_method;

/**
 * Created by ocean on 02/08/14.
 */
public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //You can optionally override the toString method
    @Override
    public String toString() {
        return getName() + " " + getAge();
    }
}
