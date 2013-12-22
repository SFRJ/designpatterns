package RetailStoreKata.strategies.quality;

import RetailStoreKata.model.Item;
import RetailStoreKata.strategies.QualityStrategy;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 01/09/13
 * Time: 16:18
 * To change this template use File | Settings | File Templates.
 */
public class SulfurasQuality implements QualityStrategy {

    @Override
    public void decreaseQuality(Item item) {
         if(isNotSold(item) && isQualityGreatterThanZero(item))
             item.setQualityValue(item.getQualityValue() - 1);
    }

    @Override
    public void increaseQuality(Item item) {
        //Sulfuras doesn't increment quality
    }

    private boolean isQualityGreatterThanZero(Item item) {
        return item.getQualityValue() > 0;
    }

    private boolean isNotSold(Item item) {
        return item.isSold() == false;
    }
}
