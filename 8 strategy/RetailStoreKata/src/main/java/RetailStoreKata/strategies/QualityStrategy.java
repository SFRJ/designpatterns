package RetailStoreKata.strategies;

import RetailStoreKata.model.Item;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 01/09/13
 * Time: 12:49
 * To change this template use File | Settings | File Templates.
 */
public interface QualityStrategy {

    public void decreaseQuality(Item item);
    public void increaseQuality(Item item);

}
