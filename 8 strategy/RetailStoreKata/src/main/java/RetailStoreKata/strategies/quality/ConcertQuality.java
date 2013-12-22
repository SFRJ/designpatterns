package RetailStoreKata.strategies.quality;

import RetailStoreKata.model.Item;
import RetailStoreKata.strategies.QualityStrategy;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 01/09/13
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */
public class ConcertQuality implements QualityStrategy {

    @Override
    public void decreaseQuality(Item item) {
        if(dateIsDue(item))
            item.setQualityValue(0);
    }

    @Override
    public void increaseQuality(Item item) {
        if(itemDaysLeftToSellBetweenFiveAndTenExclusive(item))
            item.setQualityValue(item.getQualityValue() + 2);
        else if(fiveDaysLeftToSell(item))
            item.setQualityValue(item.getQualityValue() + 3);
    }

    private boolean dateIsDue(Item item) {
        return item.getSellInValue() == 0;
    }

    private boolean itemDaysLeftToSellBetweenFiveAndTenExclusive(Item item) {
        return lessThanTenDaysToSell(item) && moreThanFiveDaysLeftToSell(item);
    }

    private boolean lessThanTenDaysToSell(Item item) {
        return item.getSellInValue() < 10;
    }

    private boolean moreThanFiveDaysLeftToSell(Item item) {
        return item.getSellInValue() > 5;
    }

    private boolean fiveDaysLeftToSell(Item item) {
        return item.getSellInValue() <= 5;
    }

    private boolean atLeastOneDayLeftTosell(Item item) {
        return item.getSellInValue() > 0;
    }

    private boolean lessThanThreeDayLeftTosell(Item item) {
        return item.getSellInValue() < 3;
    }
}
