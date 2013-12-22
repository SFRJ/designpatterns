package MediatorPatternExample.colleagues;

import MediatorPatternExample.mediator.Mediator;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 05/09/13
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteBColleague extends Colleague {

    public ConcreteBColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
       System.out.println("This is [B] message received:\n" + message);
    }
}
