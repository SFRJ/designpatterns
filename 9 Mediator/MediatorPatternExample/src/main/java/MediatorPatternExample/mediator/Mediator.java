package MediatorPatternExample.mediator;

import MediatorPatternExample.colleagues.Colleague;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 05/09/13
 * Time: 19:09
 * To change this template use File | Settings | File Templates.
 */
public interface Mediator {
    public void send(String message,Colleague colleague);
}
