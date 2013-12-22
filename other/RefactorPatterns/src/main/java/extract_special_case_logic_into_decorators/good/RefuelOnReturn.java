package extract_special_case_logic_into_decorators.good;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 18/08/13
 * Time: 09:56
 * To change this template use File | Settings | File Templates.
 */
class RefuelOnReturn extends CarRentalDecorator {
    private float refuelPrice;
    public RefuelOnReturn(Rental r, float refuelPrice) {
        super(r);
        this.refuelPrice = refuelPrice;
    }
    private float refuelPrice() {
        return(rental.getModel().fuelCapacity - rental.getFuelConsumed()) * refuelPrice;
    }
    public float calcPrice() {
        return rental.calcPrice() + refuelPrice();
    }
}