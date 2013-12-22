package extract_creation_class.good;

import java.util.Date;
/*
*Too many Creation Methods on a class obscure it’s primary responsibility (or responsibilities)
*Move the Creation Methods for a related set of classes to one Creation Class
*
* When we create classes, we give then responsibilities.
* One such responsibility, which is often not a class’s primary
*responsibility, is object creation.
*When object creation begins to dominate the public interface of
*the class, the class no longer strongly communicates its main
*purpose. When that happens,
*it’s best to communicate the act of object creation by creating a
*special class just to create instances of the object – i.e. a
*Creation Class.
* Simplicity:
* One principle states that the fewer responsibilities a class
*has, the simpler it is. That principle can lead to an
*explosion of class, which can make a system not simple to
*work with at all. So one must use judgement. When creational
*responsibilities mix too much with a class’s main
*responsibilities, the class isn’t simple. Simplify it by extracting
*the creational code into a Creation Class.
* */
public class LoanCreator {

    public static Loan newAdvisor(double notional, Date start,Date maturity, int rating)  {
    return new Loan(notional, start, null, maturity, rating, new TermLoanCapital());
    }

    public static Loan newLetterOfCredit(double notional, Date start,
                                         Date maturity, int rating) {
        return new Loan(notional, start, null, maturity, rating, new TermLoanCapital());
    }

    public static Loan newRCTL(double notional, Date start,
                               Date expiry, Date maturity, int rating) {
        return new Loan(notional, start, expiry, maturity, rating, new RCTLCapital());
    }

    public static Loan newRevolver(double notional, Date start,
                                   Date expiry, int rating) {
        return new Loan(notional, start, expiry, null, rating, new RevolverCapital());
    }

    public static Loan newSPLC(double notional, Date start,
                               Date maturity, int rating) {
        return new Loan(notional, start, null, maturity, rating, new TermLoanCapital());
    }

    public static Loan newTermLoan(double notional, Date start,
                                   Date maturity, int rating) {
        return new Loan(notional, start, null, maturity, rating, new TermLoanCapital());
    }
}