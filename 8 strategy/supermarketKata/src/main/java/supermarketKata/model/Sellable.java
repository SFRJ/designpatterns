package supermarketKata.model;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 11:35
 * To change this template use File | Settings | File Templates.
 */
public interface Sellable {

    public double getPrice();

    public String getName();

    public int getQuantity();

    public void setQuantity(int quantity);
}
