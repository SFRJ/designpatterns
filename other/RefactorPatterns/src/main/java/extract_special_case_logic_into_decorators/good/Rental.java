package extract_special_case_logic_into_decorators.good;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 18/08/13
 * Time: 09:42
 * To change this template use File | Settings | File Templates.
 */
public interface Rental{
    public float calcPrice();
    public int getDaysRented();
    public Model getModel();
    public float getFuelConsumed();
    public void setFuelConsumed(float amount);
}