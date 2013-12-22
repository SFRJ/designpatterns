package FundRaisingObserverPattern;

/**
 * This class and its subclasses are the observers that are interested of being informed about the change of state
 * in the subject(CharityEvent in this case).
 */
public abstract class PeopleInNeed {

    protected CharityEvent charityEvent;

    public abstract void update();
}
