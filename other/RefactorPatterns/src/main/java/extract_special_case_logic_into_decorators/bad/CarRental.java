package extract_special_case_logic_into_decorators.bad;

/**
 *Your classes or methods have optional or special-case processing logic
 *Retain core logic but extract optional or special-case logic into Decorators
 *
 * Communication:
 * Some code just doesn't have to be run very often. But if you lump that code in with code that
 * does have to be run often, you don't communicate what is and what is not important.
 * Decorators give you a way to communicate what is core code from what is optional.
 *
 * Duplication:
 * As logic gets more complicated,you often see code that tries to
 * accommodate many combinations of behavior. This can lead to a lot of duplicate
 * code. Decorators offer a better way to handle diverse combinations of behavior without
 * duplicating code.
 *
 * Simplicity:
 * Code that mixes together the essential with the optional isn’t
 * as simple as code that contains solely what is essential. On the
 * other hand, Decorators aren't always simple to use when you
 * have to worry about the order in which you add them.
 */
class CarRental {
    protected float fuelConsumed;
    protected int days;
    protected Model model;
    protected float insuranceRate;
    protected boolean hasInsurance;
    protected boolean hasRefuelOnReturn;
    protected float refuelPrice;
    public CarRental(Model m, int rentalDays) {
        model = m;
        days = rentalDays;
        hasInsurance = false;
        hasRefuelOnReturn = false;
    }
    public float calcPrice() {
        float price = (model.price * days);
        //This 2 if statements are The optional or special- case logic.
        if (hasInsurance)
            price += insuranceAmount();
        if (hasRefuelOnReturn)
            price += refuelPrice();
        return price;
    }
    public int getDaysRented() {
        return days;
    }
    public Model getModel() {
        return model;
    }
    public float getFuelConsumed() {
        return fuelConsumed;
    }
    public void setFuelConsumed(float amount) {
        fuelConsumed = amount;
    }
    private float insuranceAmount() {
        return insuranceRate * getDaysRented();
    }
    public void setInsurance(float rate) {
        insuranceRate = rate;
        hasInsurance = true;
    }
    private float refuelPrice() {
        return(getModel().fuelCapacity - getFuelConsumed()) * refuelPrice;
    }
    public void setRefuelOnReturn(float pricePerGallon) {
        refuelPrice = pricePerGallon;
        hasRefuelOnReturn = true;
    }
}