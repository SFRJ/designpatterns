package RetailStoreKata;

import RetailStoreKata.model.Item;
import RetailStoreKata.model.ItemBuilder;
import RetailStoreKata.strategies.context.QualityContext;

public class ItemVerifier {

    private Item updatedItem;
    private QualityContext qualityContext = new QualityContext();

    public ItemVerifier() {
        this.updatedItem = new ItemBuilder().createItem();
    }

    public void updateQuality(Item item) {
        this.updatedItem = item;
        qualityContext.increaseQuality(updatedItem);
        qualityContext.decreaseQuality(updatedItem);
        decreaseSellInDaysByOne();

    }

    private void decreaseSellInDaysByOne() {
        if(thereAreDaysLeftToSell())
        updatedItem.setSellInValue(updatedItem.getSellInValue() - 1);
    }

    private boolean thereAreDaysLeftToSell() {
        return updatedItem.getSellInValue() >0;
    }

    public Item getUpdatedItem() {
        return updatedItem;
    }
}
