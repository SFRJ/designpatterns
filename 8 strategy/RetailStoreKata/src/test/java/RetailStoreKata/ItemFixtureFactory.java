package RetailStoreKata;

import RetailStoreKata.model.Item;
import RetailStoreKata.model.ItemBuilder;

public class ItemFixtureFactory {

    public static Item expiredItem() {
        return new ItemBuilder().
                setSellInValue(0).
                setQualityValue(10).
                setName("milk").
                setSold(true).createItem();
    }

    public static Item nonExpiredItem() {
        return new ItemBuilder().
                setSellInValue(14).
                setQualityValue(10).
                setName("rice").
                setSold(true).createItem();
    }

    public static Item nonQualityItem() {
        return new ItemBuilder().
                setSellInValue(14).
                setQualityValue(0).
                setName("banana").
                setSold(true).createItem();
    }

    public static Item agedBrieItem() {
        return new ItemBuilder().
                setSellInValue(5).
                setQualityValue(1).
                setName("aged brie").
                setSold(true).createItem();
    }

    public static Item unsoldSulfuras() {
        return new ItemBuilder().
                setSellInValue(5).
                setQualityValue(6).
                setName("sulfuras").
                setSold(false).createItem();
    }

    public static Item backstagePasses() {
        return new ItemBuilder().
                setSellInValue(8).
                setQualityValue(6).
                setName("Backstage passes").
                setSold(false).createItem();
    }

    public static Item backstagePassesJustBeforeConcert() {
        return new ItemBuilder().
                setSellInValue(3).
                setQualityValue(6).
                setName("Backstage passes").
                setSold(false).createItem();
    }

    public static Item backstagePassesDue() {
        return new ItemBuilder().
                setSellInValue(0).
                setQualityValue(6).
                setName("Backstage passes").
                setSold(false).createItem();
    }
}
