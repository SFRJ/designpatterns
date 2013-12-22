package supermarketKata.strategies;

import supermarketKata.model.Sellable;
import supermarketKata.model.SoldByUnitItem;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 02/09/13
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */
public class SellByUnitStrategy extends PriceCalculationStrategy {

    @Override
    public double checkOut(Sellable item) {
        return item.getPrice() * item.getQuantity();
    }
}
