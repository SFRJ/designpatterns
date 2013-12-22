package RetailStoreKata;

import RetailStoreKata.model.Item;
import org.junit.Before;
import org.junit.Test;
import static RetailStoreKata.ItemFixtureFactory.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 31/08/13
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class ItemQualityCheckSpecification {
/*
- All items have a SellIn value which denotes the number of days we have to sell the item
- All items have a Quality value which denotes how valuable the item is
- At the end of each day our system lowers both values for every item

- Once the sell by date has passed, Quality degrades twice as fast
- The Quality of an item is never negative
- “Aged Brie” actually increases in Quality the older it gets
- The Quality of an item is never more than 50
- “Sulfuras”, being a legendary item, never has to be sold or decreases in Quality
- “Backstage passes”, like aged brie, increases in Quality as it’s SellIn value approaches;
   Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less
   but Quality drops to 0 after the concert

- “Conjured” items degrade in Quality twice as fast as normal items
*/

    private ItemVerifier verifier;
    private Item item;

    @Before
    public void initDependencies() {
           verifier = new ItemVerifier();
    }

    @Test
    public void afterTheQualityIsUpdatedTheSellInDaysIsLoweredByOne() {
         verifier.updateQuality(nonQualityItem());
         verifier.getUpdatedItem();
         assertThat(verifier.getUpdatedItem().getSellInValue(),is(13));
    }

    @Test
    public void whenTheProductIsExpiredTheSellInValueDoesNotGoBelowZeroWhenMoreDaysPass() {
        verifier.updateQuality(expiredItem());
        verifier.getUpdatedItem();
        assertThat(verifier.getUpdatedItem().getSellInValue(),is(0));

    }

    @Test
    public void whenDateIsDueQualityDegradesTwiceAsFast() {
        verifier.updateQuality(expiredItem());
        Item item = verifier.getUpdatedItem();
        assertThat(item.getQualityValue(),is(8));
    }

    @Test
    public void theQualityOfAnItemIsNeverNegative() {
       verifier.updateQuality(nonQualityItem());
        Item item = verifier.getUpdatedItem();
        assertThat(item.getQualityValue(),is(0));
    }

    @Test
    public void agedBrieIncreasesQuality() {
        verifier.updateQuality(agedBrieItem());
        Item item = verifier.getUpdatedItem();
        assertThat(item.getQualityValue(),is(2));
    }

    @Test
    public void sulfurasDecreasesQualityIfNotSold() {
        verifier.updateQuality(unsoldSulfuras());
        Item item = verifier.getUpdatedItem();
        assertThat(item.getQualityValue(),is(5));
    }

    @Test
    public void backStagePassesIncreaseQualityIncreaseBy2WhenThereAre10DaysLeftOrLess() {
        verifier.updateQuality(backstagePasses());
        Item item = verifier.getUpdatedItem();
        assertThat(item.getQualityValue(),is(8));

    }

    @Test
    public void backStagePassesIncreaseQualityIncreaseBy3WhenThereAre5DaysLeftOrLess() {
        verifier.updateQuality(backstagePassesJustBeforeConcert());
        Item item = verifier.getUpdatedItem();
        assertThat(item.getQualityValue(),is(9));
    }

    @Test
    public void qualityDropsTo0AfterConcert() {
        verifier.updateQuality(backstagePassesDue());
        Item item = verifier.getUpdatedItem();
        assertThat(item.getQualityValue(),is(0));
    }
}