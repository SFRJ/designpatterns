package replace_conditional_calculations_with_strategy.bad;

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
    private double notional;
    private double outstanding;
    private int rating;
    private double unusedPercentage;
    private Date start;
    private Date expiry;
    private Date maturity;
    private static final int MILLIS_PER_DAY = 86400000;

    public double calcCapital() {
        return riskAmount() * duration() * RiskFactor.forRiskRating(rating);
    }

    private double calcUnusedRiskAmount() {
        return (notional - outstanding) * unusedPercentage;
    }

    private double duration() {
        if (expiry == null)
            return ((maturity.getTime() - start.getTime()) / MILLIS_PER_DAY) / 365;
        else if (maturity == null)
            return ((expiry.getTime() - start.getTime()) / MILLIS_PER_DAY) / 365;
        else {
        long millisToExpiry = expiry.getTime() - start.getTime();
        long millisFromExpiryToMaturity = maturity.getTime() - expiry.getTime();
        double revolverDuration = (millisToExpiry / MILLIS_PER_DAY) / 365;
        double termDuration = (millisFromExpiryToMaturity / MILLIS_PER_DAY) / 365;
        return revolverDuration + termDuration;
        }
    }

    private double riskAmount() {
        if (unusedPercentage != 1.00)
            return outstanding + calcUnusedRiskAmount();
        else
            return outstanding;
    }

    public void setOutstanding(double newOutstanding) {
        outstanding = newOutstanding;
    }

    private void setUnusedPercentage() {
        if (expiry != null && maturity != null) {
        if (rating > 4)
            unusedPercentage = 0.95;
        else
            unusedPercentage = 0.50;
        } else if (maturity != null) {
            unusedPercentage = 1.00;
        } else if (expiry != null) {
            if (rating > 4)
            unusedPercentage = 0.75;
        else
        unusedPercentage = 0.25;
        }
    }
}