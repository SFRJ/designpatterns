package supermarketKata;

import supermarketKata.model.Sellable;
import supermarketKata.model.SoldByUnitItem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 02/09/13
 * Time: 12:49
 * To change this template use File | Settings | File Templates.
 */
public class PaymentPoint {

    private Map<String, Sellable> cart = new HashMap<String, Sellable>();
    PriceContext priceContext = new PriceContext();

    public double checkOut(Map<String, Sellable> items) {
        this.cart = items;
        double total = priceContext.checkOut(items);

        applyDiscounts(items);

        return total;
    }

    private void applyDiscounts(Map<String, Sellable> cart) {
        for (Sellable item : cart.values()) {
            if (item.getName().equals("Soup cans")) {
                item.setQuantity(item.getQuantity() + item.getQuantity() / 4);
            } else if (item.getName().equals("Noodles")) {
                item.setQuantity(item.getQuantity() + item.getQuantity() / 3);
            }
        }
    }
}
