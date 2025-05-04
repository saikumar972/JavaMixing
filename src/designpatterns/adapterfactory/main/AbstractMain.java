package designpatterns.adapterfactory.main;

import designpatterns.adapterfactory.Cars.Cars;
import designpatterns.adapterfactory.FactoryClasses.AbstractFactory;
import designpatterns.adapterfactory.FactoryClasses.ParentAbstract;

public class AbstractMain {
    public static void main(String[] args) {
        ParentAbstract parentAbstract= new ParentAbstract();
        AbstractFactory abstractFactory=parentAbstract.getCarTypeFactory("Economic");
        Cars carType= abstractFactory.getCarType("Benz");
        System.out.println(carType.getEvVehicle("economic"));
    }
}
