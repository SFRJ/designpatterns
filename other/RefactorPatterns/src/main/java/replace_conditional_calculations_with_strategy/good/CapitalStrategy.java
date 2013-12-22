package replace_conditional_calculations_with_strategy.good;

public abstract class CapitalStrategy {

    protected Loan loan;
    protected static final int MILLIS_PER_DAY = 86400000;

    public double calc(Loan loan) {
        this.loan = loan;
        return riskAmount() * duration() * RiskFactor.forRiskRating(loan.getRating());
    }
    private double calcUnusedPercentage() {
        if (loan.getExpiry() != null && loan.getMaturity() != null) {
            if (loan.getRating() > 4) return 0.95;
            else return 0.50;
        } else if (loan.getMaturity() != null) {
            return 1.00;
        } else if (loan.getExpiry() != null) {
            if (loan.getRating() > 4) return 0.75;
            else return 0.25;
        }
        return 0.0;
    }

    protected abstract double duration();

    protected abstract double riskAmount();
}
