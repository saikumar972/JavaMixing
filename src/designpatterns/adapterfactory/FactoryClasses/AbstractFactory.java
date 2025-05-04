package designpatterns.adapterfactory.FactoryClasses;

import designpatterns.adapterfactory.Cars.Cars;

public interface AbstractFactory {
    public Cars getCarType(String carName);
}
