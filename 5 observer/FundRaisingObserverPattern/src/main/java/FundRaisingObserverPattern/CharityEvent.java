package FundRaisingObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * In the observer pattern, this class represents the "Subject".
 * This class contains state(totalFundsRaisedSoFar), that the observers are interested in.
 * Whenever the state changes, this class is responsible for letting the observers know.
 *
 * Notice that the notify() method will execute the observers logic.
 */
public class CharityEvent {
    private List<PeopleInNeed> suportersList = new ArrayList<PeopleInNeed>();
    private int totalFundsRaisedSoFar;

    //Registers a potential suporter for this event
    public void attach(PeopleInNeed suporter) {
        suportersList.add(suporter);
    }
    //Returns the state that the supporters are interested about
    public int getTotalFundsRaisedSoFar() {
        return totalFundsRaisedSoFar;
    }
    //Changes the state and notifies the supporters
    public void increaseFunds(int donation) {
        totalFundsRaisedSoFar += donation;
        notifySupporters();
    }
    //Logic for advising the supporters that the state changed
    private void notifySupporters() {
        for(PeopleInNeed suporter:suportersList)
            suporter.update();
    }
}
