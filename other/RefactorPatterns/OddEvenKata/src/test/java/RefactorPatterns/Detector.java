package RefactorPatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 25/08/13
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public abstract class Detector {

    private String numberType;
    protected Map<String, Detector> numbers = new HashMap<String, Detector>();

    public String getNumberType() {
        return numberType;
    }

    public String setNumberType(String numberType) {
        return this.numberType = numberType;
    }

    public abstract void check();

}
