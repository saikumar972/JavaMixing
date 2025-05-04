package designpatterns.adapterfactory.FactoryClasses;

import designpatterns.adapterfactory.Cars.Cars;
import designpatterns.adapterfactory.Cars.LuxuryCar1;
import designpatterns.adapterfactory.Cars.LuxuryCar2;

public class LuxuryFactoryClasses implements AbstractFactory{
    public Cars getCarType(String LuxuryCarType){
        switch (LuxuryCarType){
            case "Benz": return new LuxuryCar1();
            case "Volkswagen": return new LuxuryCar2();
            default: return null;
        }
    }
}
