package supermarketKata.strategies;

import supermarketKata.model.Sellable;
import supermarketKata.model.SoldByUnitItem;
import supermarketKata.model.SoldByWeightItem;


public class SellByWeightStrategy extends PriceCalculationStrategy {
    @Override
    public double checkOut(Sellable item) {
        return (item.getPrice() * item.getQuantity())/100;
    }
}
