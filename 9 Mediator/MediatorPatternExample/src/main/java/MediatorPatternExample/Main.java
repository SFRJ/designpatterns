package MediatorPatternExample;

import MediatorPatternExample.colleagues.ConcreteAColleague;
import MediatorPatternExample.colleagues.ConcreteBColleague;
import MediatorPatternExample.mediator.ApplicationMediator;

/**
 * Intent
 Define an object that encapsulates how a set of objects interact.
 Mediator promotes loose coupling by keeping objects from referring to each other explicitly,
 and it lets you vary their interaction independently.
 Design an intermediary to decouple many peers.
 Promote the many-to-many relationships between interacting peers to “full object status”.

 Examples
 The Mediator defines an object that controls how a set of objects interact. Loose coupling between colleague
 objects is achieved by having colleagues communicate with the Mediator, rather than with each other.
 The control tower at a controlled airport demonstrates this pattern very well. The pilots of the planes approaching
 or departing the terminal area communicate with the tower rather than explicitly communicating with one another.

 Another example where Mediator is useful is the design of a user and group capability in an operating system.
 A group can have zero or more users, and, a user can be a member of zero or more groups.
 The Mediator pattern provides a flexible and non-invasive way to associate and manage users and groups.

 Check list
 1- Identify a collection of interacting objects that would benefit from mutual decoupling.

 2- Encapsulate those interactions in the abstraction of a new class.

 3- Create an instance of that new class and rework all “peer” objects to interact with the Mediator only.

 4- Balance the principle of decoupling with the principle of distributing responsibility evenly.

 5- Be careful not to create a “controller” or “god” object


 Rules of thumb
 - Chain of Responsibility, Command, Mediator, and Observer, address how you can decouple senders and receivers,
 but with different trade-offs. Chain of Responsibility passes a sender request along a chain of potential receivers.
 Command normally specifies a sender-receiver connection with a subclass. Mediator has senders and receivers reference
 each other indirectly. Observer defines a very decoupled interface that allows for multiple receivers to be configured
 at run-time.

 - Mediator and Observer are competing patterns. The difference between them is that Observer distributes communication
 by introducing “observer” and “subject” objects, whereas a Mediator object encapsulates the communication between other
 objects. We’ve found it easier to make reusable Observers and Subjects than to make reusable Mediators.

 - On the other hand, Mediator can leverage Observer for dynamically registering colleagues and communicating with them.

 - Mediator is similar to Facade in that it abstracts functionality of existing classes. Mediator abstracts/centralizes
 arbitrary communication between colleague objects, it routinely “adds value”, and it is known/referenced by the
 colleague objects (i.e. it defines a multidirectional protocol). In contrast, Facade defines a simpler interface
 to a subsystem, it doesn’t add new functionality, and it is not known by the subsystem classes (i.e. it defines
 a unidirectional protocol where it makes requests of the subsystem classes but not vice versa).

 Disadvantages:
 While this pattern aims to reduce complexity, without proper design, the Mediator object itself can become very
 complicated itself.The Observer pattern could help here, with the colleague objects dealing with the events from
 the mediator, rather than having the mediator look after all orchestration.

 */

public class Main {
    public static void main(String[] args) {
        ApplicationMediator applicationMediator = new ApplicationMediator();
        ConcreteAColleague sideA = new ConcreteAColleague(applicationMediator);
        ConcreteBColleague sideB = new ConcreteBColleague(applicationMediator);

        applicationMediator.addColleague(sideA);
        applicationMediator.addColleague(sideB);

        sideA.send("I am A and I am broadcasting this message");

    }
}
