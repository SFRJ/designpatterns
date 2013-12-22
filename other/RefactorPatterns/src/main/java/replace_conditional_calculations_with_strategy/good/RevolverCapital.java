package replace_conditional_calculations_with_strategy.good;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 18/08/13
 * Time: 08:41
 * To change this template use File | Settings | File Templates.
 */
public class RevolverCapital extends CapitalStrategy {
    private double calcUnusedPercentage() {
        if (loan.getRating() > 4) return 0.75;
        else return 0.25;
    }
    private double calcUnusedRiskAmount() {
        return (loan.getNotional() - loan.getOutstanding()) * calcUnusedPercentage();
    }
    protected double duration() {
        return (
                (loan.getExpiry().getTime() - loan.getStart().getTime()) / MILLIS_PER_DAY)
                / 365;
    }
    protected double riskAmount() {
        return loan.getOutstanding() + calcUnusedRiskAmount();
    }
}
