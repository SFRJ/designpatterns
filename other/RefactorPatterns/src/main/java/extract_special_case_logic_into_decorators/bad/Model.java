package extract_special_case_logic_into_decorators.bad;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 18/08/13
 * Time: 09:27
 * To change this template use File | Settings | File Templates.
 */
class Model {
    public float fuelCapacity;
    public float price;
    public String name;
    public Model(float fuelCapacity, float price, String name) {
        this.fuelCapacity = fuelCapacity;
        this.price = price;
        this.name = name;
    }
}