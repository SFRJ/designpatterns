package RetailStoreKata.strategies.quality;

import RetailStoreKata.model.Item;
import RetailStoreKata.strategies.QualityStrategy;

public class BrieQuality implements QualityStrategy {
    @Override
    public void decreaseQuality(Item item) {
       //Brie never loses quality
    }

    @Override
    public void increaseQuality(Item item) {
        if(isQualityGreatterThanZero(item))
        item.setQualityValue(item.getQualityValue() + 1);
    }

    private boolean isQualityGreatterThanZero(Item item) {
        return item.getQualityValue() > 0;
    }

}
