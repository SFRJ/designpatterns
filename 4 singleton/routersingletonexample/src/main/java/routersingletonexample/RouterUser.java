package routersingletonexample;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 04/09/13
 * Time: 13:58
 * To change this template use File | Settings | File Templates.
 */
public class RouterUser implements Runnable {

    private String message;
    private String destination;

    public RouterUser(String message, String destination) {
        this.message = message;
        this.destination = destination;
    }

    public void run() {
        Router.getInstance().route(message,destination);
    }
}
