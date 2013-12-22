package extract_special_case_logic_into_decorators.good;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 18/08/13
 * Time: 09:56
 * To change this template use File | Settings | File Templates.
 */
public class UsingDemo {

    public static void main(String [] args) {
        Model m = new Model(10.0f, 50.0f, "Ford Taurus");
        Rental insuredFord = new Insurance(new CarRental(m, 5), 12.5f);
        Rental refuelInsuredFord = new RefuelOnReturn(insuredFord, 3.75f);
        float price = refuelInsuredFord.calcPrice();
    }
}
