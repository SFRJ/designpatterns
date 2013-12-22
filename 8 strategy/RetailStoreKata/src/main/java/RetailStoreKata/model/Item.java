package RetailStoreKata.model;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 31/08/13
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    private String name;
    private int sellInValue;
    private int qualityValue;
    private Type type;
    private boolean sold;


    public Item(String name,int sellInValue,int qualityValue,Type type,boolean sold) {
        this.name = name;
        this.sellInValue = sellInValue;
        this.qualityValue = qualityValue;
        this.type = type;
        this.sold = sold;
    }

    public int getSellInValue() {
        return sellInValue;
    }

    public void setSellInValue(int sellInValue) {
        this.sellInValue = sellInValue;
    }

    public int getQualityValue() {
        return qualityValue;
    }

    public void setQualityValue(int qualityValue) {
        this.qualityValue = qualityValue;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
