package FundRaisingObserverPattern;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 04/09/13
 * Time: 17:04
 * To change this template use File | Settings | File Templates.
 */
public class Orphan extends PeopleInNeed {

    public Orphan(CharityEvent charityEvent) {
        this.charityEvent = charityEvent;
        charityEvent.attach(this);
    }

    @Override
    public void update() {
        System.out.println("The money raised for the event is: " + charityEvent.getTotalFundsRaisedSoFar() + " some of this money will go to the orphan cause");
    }
}
