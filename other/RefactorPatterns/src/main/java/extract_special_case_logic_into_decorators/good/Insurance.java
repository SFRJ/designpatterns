package extract_special_case_logic_into_decorators.good;

/**
*  •replacing the setInsurance(float rate) method with a constructor argument
* •creating an instance variable, called rate, to hold the insurance amount
* •creating a copy of the old CarRental method, insuranceAmount()
* •updating the calcPrice() method to add the computed insurance amount to the rate
* computed by the delegate variable, rental.
 */

class Insurance extends CarRentalDecorator {
    protected float rate;
    public Insurance(Rental r, float rate) {
        super(r);
        this.rate = rate;
    }
    private float insuranceAmount() {
        return rate * rental.getDaysRented();
    }
    public float calcPrice() {
        return rental.calcPrice() + insuranceAmount();
    }
}
