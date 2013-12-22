package RetailStoreKata.model;

public class ItemBuilder {
    private String name;
    private int sellInValue;
    private int qualityValue;
    private Type type;
    private boolean sold;

    public ItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ItemBuilder setSellInValue(int sellInValue) {
        this.sellInValue = sellInValue;
        return this;
    }

    public ItemBuilder setQualityValue(int qualityValue) {
        this.qualityValue = qualityValue;
        return this;
    }

    public ItemBuilder setType(Type type) {
        this.type = type;
        return this;
    }

    public ItemBuilder setSold(boolean sold) {
        this.sold = sold;
        return this;
    }

    public Item createItem() {
        return new Item(name, sellInValue, qualityValue, type, sold);
    }
}