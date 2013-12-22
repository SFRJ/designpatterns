package replace_conditional_calculations_with_strategy.good;

/*
* You use a lot of conditional logic in a calculation
* Delegate the calculation to a Strategy object
*
* Communication:
* Copious conditional logic obscures the steps of a
* calculation. Communicate the steps clearly by separating each
* calculation variety into its own Strategy class. Then clarify
* which variety of calculation your object uses by writing code to
* pass the appropriate Strategy to the object for its use in
* performing the calculation.
*
* Duplication:
* Conditional calculation code can often contain duplicate
* conditional statements that are used to calculate various
* variables in an algorithm.
* Replace all of the conditional logic by encapsulating each
* variety of the calculation in its own Strategy class.
*/

import java.util.Date;

public class Loan {

public double notional;
public double outstanding;
public int rating;
private double unusedPercentage;
private Date start;
public Date expiry;
public Date maturity;
private static final int MILLIS_PER_DAY = 86400000;
private CapitalStrategy capitalStrategy;

    public Loan(double notional, Date start, Date expiry, Date maturity, int rating, CapitalStrategy strategy) {
        this.notional = notional;
        this.start = start;
        this.expiry = expiry;
        this.maturity = maturity;
        this.rating = rating;
        this.capitalStrategy = strategy;
    }

//The calculation is delagated to the strategy(The state and behaivour were separated)

    public double calcCapital() {
        return capitalStrategy.calc(this);
    }

    public static Loan newRCTL(double notional, Date start, Date expiry,
                               Date maturity, int rating) {
        return new Loan(notional, start, expiry, maturity, rating, new RCTLCapital());
    }
    public static Loan newRevolver(double notional, Date start, Date expiry,int rating) {
        return new Loan(notional, start, expiry, null, rating, new RevolverCapital());
    }
    public static Loan newTermLoan(double notional, Date start, Date maturity,int rating) {
        return new Loan(notional, start, null, maturity, rating, new TermLoanCapital());
    }

    public int getRating() {
        return rating;
    }

    public Date getExpiry() {
        return expiry;
    }

    public Date getMaturity() {
        return maturity;
    }

    public double getNotional() {
        return notional;
    }

    public double getOutstanding() {
        return outstanding;
    }

    public Date getStart() {
        return start;
    }
}