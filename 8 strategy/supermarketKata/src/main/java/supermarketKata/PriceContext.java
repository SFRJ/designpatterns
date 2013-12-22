package supermarketKata;

import supermarketKata.model.Sellable;
import supermarketKata.model.SoldByUnitItem;
import supermarketKata.model.SoldByWeightItem;
import supermarketKata.strategies.PriceCalculationStrategy;
import supermarketKata.strategies.SellByUnitStrategy;
import supermarketKata.strategies.SellByWeightStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 02/09/13
 * Time: 14:44
 * To change this template use File | Settings | File Templates.
 */
public class PriceContext {

    private Map<String,PriceCalculationStrategy> strategies = new HashMap<String,PriceCalculationStrategy>();
    private PriceCalculationStrategy strategy;

    public PriceContext() {
        strategies.put("byUnit",new SellByUnitStrategy());
        strategies.put("byWeight",new SellByWeightStrategy());
    }

    public double checkOut(Map<String,Sellable> items) {
        double total = 0D;
        for(Sellable item:items.values()) {
             if(item instanceof SoldByWeightItem)
                 total += strategies.get("byWeight").calculatePrices(item);
             else
               total += strategies.get("byUnit").calculatePrices(item);
         }
         return total;
    }
}
