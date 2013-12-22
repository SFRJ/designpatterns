package BuilderPatternExample;


import BuilderPatternExample.staticinnerclass.PersonBuilderOptionA;
import BuilderPatternExample.staticinnerclass.PersonBuilderOptionB;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 05/09/13
 * Time: 01:22
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        //Using a builder with static inner class but not imutable
        PersonBuilderOptionA optionA = PersonBuilderOptionA.PersonBuilder.person().withAge(2).withName("Vukan").build();
        //Using a builder with static inner class that is imutable
        PersonBuilderOptionB optionB = new PersonBuilderOptionB.PersonBuilder().withName("Djordje").withAge(27).build();

        System.out.println(optionA.getName() + " " + optionA.getAge());
        System.out.println(optionB.getName() + " " + optionB.getAge());

    }
}
