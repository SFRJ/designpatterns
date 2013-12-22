package FundRaisingObserverPattern;

/**
 * The intention of the observer pattern is:
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 *
 * This are the steps to implement
 * 1- Model the “independent” functionality with a “subject” abstraction
 * 2- Model the “dependent” functionality with “observer” hierarchy
 * 3- The Subject is coupled only to the Observer base class
 * 4- Observers register themselves with the Subject
 * 5- The Subject broadcasts events to all registered Observers
 * 6- Observers “pull” the information they need from the Subject
 * 7- Client configures the number and type of Observers
 */
public class StartingPoint {

    public static void main(String[] args) {
        //The subject is initialized
        CharityEvent charityEvent = new CharityEvent();
        //When the observers are created it is mandatory to assign them a subject.
        //Alternatively If in the observer we use a List, we could make them be registered to more
        //than one subject(That would be a many to many relationship).
        Refugee refugee = new Refugee(charityEvent);
        Orphan orphan = new Orphan(charityEvent);

        //When some client changes the state in the subject, every observer will be informed.
        charityEvent.increaseFunds(2000);
    }
}
