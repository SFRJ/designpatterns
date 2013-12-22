package MediatorPatternExample.mediator;

import MediatorPatternExample.colleagues.Colleague;

import java.util.ArrayList;

public class ApplicationMediator implements Mediator {

    private ArrayList<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    //All the colleagues but the conversation initiator need to receive the message
    @Override
    public void send(String message, Colleague conversationInitiator) {
        for (Colleague colleague:colleagues) {
              if(colleague != conversationInitiator)
                  colleague.receive(message);
        }
    }
}
