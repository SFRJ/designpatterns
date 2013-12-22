package RefactorPatterns;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 25/08/13
 * Time: 21:44
 * To change this template use File | Settings | File Templates.
 */
public class OddDetector extends  Detector {

    @Override
    public void check() {
             setNumberType("odd");
    }
}
