package LittleEnemies;

import java.awt.*;

public interface Enemy {
    public String getColor();
    //The passed argument is the extrensic data
    public void draw(Point point);
}
