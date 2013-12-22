package supermarketKata.strategies;

import supermarketKata.model.Sellable;
import supermarketKata.model.SoldByUnitItem;

import java.util.Map;


public abstract class PriceCalculationStrategy {
    public abstract double checkOut(Sellable item);

    public double calculatePrices(Sellable item) {
        System.out.println(item.getPrice());
        return checkOut(item);
    }
}
