package ClonningObjects;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 04/09/13
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public interface PrototypeCapable extends Cloneable {
        public PrototypeCapable clone() throws CloneNotSupportedException;
}
