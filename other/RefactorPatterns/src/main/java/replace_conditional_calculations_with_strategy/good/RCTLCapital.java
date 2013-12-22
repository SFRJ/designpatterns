package replace_conditional_calculations_with_strategy.good;

public class RCTLCapital extends CapitalStrategy {
    private double calcUnusedPercentage() {
        if (loan.getRating() > 4) return 0.95;
        else return 0.50;
    }
    private double calcUnusedRiskAmount() {
        return (loan.getNotional() - loan.getOutstanding()) * calcUnusedPercentage();
    }
    protected double duration() {
        long millisToExpiry = loan.getExpiry().getTime() - loan.getStart().getTime();
        long millisFromExpiryToMaturity =
                loan.getMaturity().getTime() - loan.getExpiry().getTime();
        double revolverDuration = (millisToExpiry / MILLIS_PER_DAY) / 365;
        double termDuration = (millisFromExpiryToMaturity / MILLIS_PER_DAY) / 365;
        return revolverDuration + termDuration;
    }
    protected double riskAmount() {
        return loan.getOutstanding() + calcUnusedRiskAmount();
    }
}