package LittleEnemies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 06/09/13
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public class EnemyFactory {

    private List<Enemy> pool;

    public EnemyFactory() {
        pool = new ArrayList<Enemy>();
    }

    public Enemy getEnemy(String color) {
        //If there is an object in the pool already with that intrensic data then return it
        for(Enemy enemy:pool) {
            if(enemy.getColor().equals(color))
                return enemy;

        }
        //If an object with that intrensic data does not yet exist, then add it to the pool and return it to the client
        Enemy nonExistingEnemy = new LittleEnemy(color);
        pool.add(nonExistingEnemy);
        return nonExistingEnemy;
    }
}
