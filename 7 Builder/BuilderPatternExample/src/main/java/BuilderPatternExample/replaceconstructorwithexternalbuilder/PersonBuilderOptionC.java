package BuilderPatternExample.replaceconstructorwithexternalbuilder;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 05/09/13
 * Time: 16:37
 * To change this template use File | Settings | File Templates.
 */
public class PersonBuilderOptionC {

    private String name;
    private int age;

    public PersonBuilderOptionC(String name,int age) {
        this.name = name;
        this.age = age;
    }

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
}
