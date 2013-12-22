package MediatorPatternExample.colleagues;

import MediatorPatternExample.mediator.Mediator;

public abstract class Colleague {
    //Colleagues interact with each other via the mediator.
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
       mediator.send(message,this);
    }

    public abstract void receive(String message);

    public Mediator getMediator() {
        return mediator;
    }
}
