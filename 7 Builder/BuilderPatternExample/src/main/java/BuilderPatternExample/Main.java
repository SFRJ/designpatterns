package BuilderPatternExample;


import BuilderPatternExample.staticinnerclass.PersonBuilderOptionA;
import BuilderPatternExample.staticinnerclass.PersonBuilderOptionB;
import BuilderPatternExample.with_static_factory_method.PersonBuilder;

import static BuilderPatternExample.with_static_factory_method.PersonBuilder.personBuilder;

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
        System.out.println(optionA.getName() + " " + optionA.getAge());

        //Using a builder with static inner class that is imutable
        PersonBuilderOptionB optionB = new PersonBuilderOptionB.PersonBuilder().withName("Djordje").withAge(27).build();
        System.out.println(optionB.getName() + " " + optionB.getAge());

        //Using a builder created with a static factoty method
        System.out.println(personBuilder().withName("Djordje").withAge(28).build());



    }
}
