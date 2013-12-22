package routersingletonexample;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 04/09/13
 * Time: 13:54
 * To change this template use File | Settings | File Templates.
 */
public class Router {
        // Private constructor prevents instantiation from other classes
        private Router() {}

        /**
         * SingletonHolder is loaded on the first execution of Singleton.getInstance()
         * or the first access to SingletonHolder.INSTANCE, not before.
         */
        private static class SingletonHolder {
            private static final Router INSTANCE = new Router();
        }

        public static Router getInstance() {
            return SingletonHolder.INSTANCE;
        }

        public void route(String packet,String destination) {
            String currentThread = Thread.currentThread().getName();
            System.out.println(currentThread + " sending '" + packet + "' to " + destination);
        }
}
