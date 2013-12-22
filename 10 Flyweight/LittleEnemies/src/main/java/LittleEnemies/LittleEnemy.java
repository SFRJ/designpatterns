package LittleEnemies;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 06/09/13
 * Time: 15:28
 * To change this template use File | Settings | File Templates.
 */
public class LittleEnemy implements Enemy {

    //Intrensic data that we want to reuse
    private String color;

    public LittleEnemy(String color) {
       this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw(Point point) {
        System.out.println(getColor() + " enemy at position X:" + point.getX() + " Y:" + point.getY());
    }
}
