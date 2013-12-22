package supermarketKata.model;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String ,SoldByUnitItem> cart = new HashMap<String, SoldByUnitItem>();

    public Map<String, SoldByUnitItem> getCart() {
        return cart;
    }

    public void setCart(Map<String, SoldByUnitItem> cart) {
        this.cart = cart;
    }
}
