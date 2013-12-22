package CarFactory;

import CarFactory.model.Car;
import CarFactory.model.FamilyCar;
import CarFactory.model.Jeep;
import CarFactory.model.SportCar;

/**
 * Created with IntelliJ IDEA.
 * User: djordje
 * Date: 03/09/13
 * Time: 15:38
 * To change this template use File | Settings | File Templates.
 */
public class CarFactory {

    public Car make(int option) {
            switch (option) {
                case 1: return new FamilyCar();
                case 2: return  new SportCar();
                case 3: return new Jeep();
            }
        return null;
    }
}
