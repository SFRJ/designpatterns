package replace_conditional_calculations_with_strategy.good;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 18/08/13
 * Time: 08:37
 * To change this template use File | Settings | File Templates.
 */
public class TermLoanCapital extends CapitalStrategy {
    protected double duration() {
        return (
                (loan.getMaturity().getTime() - loan.getStart().getTime()) / MILLIS_PER_DAY)
                / 365;
    }
    protected double riskAmount() {
        return loan.getOutstanding();
    }
}
