package MediatorPatternExample.colleagues;

import MediatorPatternExample.mediator.Mediator;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 05/09/13
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteAColleague extends Colleague {

    public ConcreteAColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("This is [A] message received:\n" + message);
    }
}
