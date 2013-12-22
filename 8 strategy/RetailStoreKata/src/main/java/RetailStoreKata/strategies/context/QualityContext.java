







































































































































package RetailStoreKata.strategies.context;

import RetailStoreKata.model.Item;
import RetailStoreKata.strategies.QualityStrategy;
import RetailStoreKata.strategies.quality.BrieQuality;
import RetailStoreKata.strategies.quality.ConcertQuality;
import RetailStoreKata.strategies.quality.GeneralItemQuality;
import RetailStoreKata.strategies.quality.SulfurasQuality;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 01/09/13
 * Time: 13:02
 * To change this template use File | Settings | File Templates.
 */
public class QualityContext {

    private Map<String,QualityStrategy> strategies = new HashMap<String, QualityStrategy>();

    public QualityContext() {
        strategies.put("Backstage passes",new ConcertQuality());
        strategies.put("aged brie",new BrieQuality());
        strategies.put("rice",new GeneralItemQuality());
        strategies.put("milk",new GeneralItemQuality());
        strategies.put("banana",new GeneralItemQuality());
        strategies.put("sulfuras",new SulfurasQuality());
    }

    public void increaseQuality(Item item) {
        QualityStrategy strategy = strategies.get(item.getName());
        if(strategy != null)
        strategy.increaseQuality(item);
    }

    public void decreaseQuality(Item item) {
        QualityStrategy strategy = strategies.get(item.getName());
        if(strategy != null)
        strategies.get(item.getName()).decreaseQuality(item);
    }
}
