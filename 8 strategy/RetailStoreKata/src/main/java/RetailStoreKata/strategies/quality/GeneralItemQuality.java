package RetailStoreKata.strategies.quality;

import RetailStoreKata.model.Item;
import RetailStoreKata.strategies.QualityStrategy;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 01/09/13
 * Time: 16:07
 * To change this template use File | Settings | File Templates.
 */
public class GeneralItemQuality implements QualityStrategy {
    @Override
    public void decreaseQuality(Item item) {
        if(dateIsDue(item))
        item.setQualityValue(item.getQualityValue() - 2);
    }

    @Override
    public void increaseQuality(Item item) {

    }

    private boolean dateIsDue(Item item) {
        return item.getSellInValue() == 0;
    }
}
